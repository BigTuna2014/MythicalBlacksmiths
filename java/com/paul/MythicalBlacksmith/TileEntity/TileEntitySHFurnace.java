package com.paul.MythicalBlacksmith.TileEntity;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

import com.paul.MythicalBlacksmith.block.SHFurnace;
import com.paul.MythicalBlacksmith.handler.SHFurnaceRecipes;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntitySHFurnace extends TileEntity implements ISidedInventory {
	
	private String localizedName;
	
	private static final int[] slots_top = new int[]{0};
	private static final int[] slots_bottom = new int[]{2, 3};
	private static final int[] slots_side = new int[]{1};
	
	private ItemStack[] slots = new ItemStack [4];
	
	public int furnaceSpeed = 200;
	public int burnTime;
	public int currentItemBurnTime;
	public int cookTime;
	
	public void setGuiDisplayName(String displayName) {
		this.localizedName = displayName;
	}
	
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.localizedName : "container.SHFurnace";
	}

	public boolean hasCustomInventoryName() {
		return this.localizedName != null && this.localizedName.length() > 0;
	}

	public int getSizeInventory() {
		return this.slots.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return this.slots[var1];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if(this.slots[i] != null) {
			ItemStack itemstack;
			
			if(this.slots[i].stackSize <= j) {
				itemstack = this.slots[i];
				this.slots[i] = null;
				return itemstack;
			}else{
				itemstack = this.slots[i].splitStack(j);
				
				if(this.slots[i].stackSize == 0) {
					this.slots[i] = null;
				}
				
				return itemstack;
			}
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		if(this.slots[i] != null) {
			ItemStack itemstack = this.slots[i];
			this.slots[i] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		this.slots[i] = itemstack;
		
		if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	public void openInventory() {}
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return i == 2 || i == 3 ? false : (i == 1 ? isItemFuel(itemstack) : true);
	}
	
	public static boolean isItemFuel (ItemStack itemstack) {
		return getItemBurnTime(itemstack) > 0;
	}
	
	public static int getItemBurnTime(ItemStack itemstack) {
		if(itemstack == null) {
			return 0;
		}else{
			Item item = itemstack.getItem();
			
			if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
				Block block = Block.getBlockFromItem(item);
				//Block Fuels
				}
				//Item Fuels
				if(item == Items.blaze_rod) return 1600;
				if(item == Items.lava_bucket) return 12800;
			}
		return GameRegistry.getFuelValue(itemstack);
	}
	
	public boolean isBurning() {
		return this.burnTime > 0;
	}
	
	public void updateEntity() {
		boolean flag = this.burnTime > 0;
		boolean flag1 = false;
		
		if(this.isBurning()) {
			this.burnTime--;
		}
		if(!this.worldObj.isRemote) {
			if(this.burnTime == 0 && this.canSmelt()) {
				this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);
				
				if(this.isBurning()) {
					flag1 = true;
					
					if (this.slots[1] != null) {
						this.slots[1].stackSize--;
						
						if(this.slots[1].stackSize == 0) {
							this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
						}
					}
				}
			}
		
		if(this.isBurning() && this.canSmelt()) {
			this.cookTime++;
			
			if(this.cookTime == this.furnaceSpeed) {
				this.cookTime = 0;
				this.smeltItem();
				flag1 = true;
			}
		}else{
			this.cookTime = 0;
		}
		
		if (flag != this.isBurning()) {
			flag1 = true;
			SHFurnace.updateSHFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		}
		if(flag1) {
			this.markDirty();
		}
	}
	
	public boolean canSmelt() {
		if (this.slots[0] == null) {
			return false;
		}else{
			ItemStack itemstack = SHFurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
			
			if(itemstack == null) return false;
			if(this.slots[2] == null) return true;
			if(!this.slots[2].isItemEqual(itemstack)) return false;
			
			int result = this.slots[2].stackSize + itemstack.stackSize;
			
			return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
		}
	}
	
	public void smeltItem() {
		if(this.canSmelt()) {
			ItemStack itemstack = SHFurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
			
			if(this.slots[2] == null) {
				this.slots[2] = itemstack.copy();
			}else if(this.slots[2].isItemEqual(itemstack)) {
				this.slots[2].stackSize += itemstack.stackSize;
			}
			
			this.slots[0].stackSize--;
			
			if (this.slots[0].stackSize <= 0) {
				this.slots[0] = null;
			}
		}
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_side);
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return this.isItemValidForSlot(i, itemstack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
	}
	
	public int getBurnTimeRemainingScaled(int i) {
		if(this.currentItemBurnTime == 0) {
			this.currentItemBurnTime = this.furnaceSpeed;
		}
		return this.burnTime * i / this.currentItemBurnTime;
	}
	
	public int getCookProgressScaled(int i) {
		return this.cookTime * i / this.furnaceSpeed;
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		
		NBTTagList list = nbt.getTagList("Items", 10);
		this.slots = new ItemStack[this.getSizeInventory()];
		
		for(int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
			byte b = compound.getByte("Slot");
			
			if(b >= 0 && b < this.slots.length) {
				this.slots[b] = ItemStack.loadItemStackFromNBT(compound);
			}
		}
		
		this.burnTime = (int)nbt.getShort("BurnTime");
		this.cookTime = (int)nbt.getShort("cookTime");
		this.currentItemBurnTime = (int)nbt.getShort("CurrentItemBurnTime");
		
		if(nbt.hasKey("CustomName")) {
			this.localizedName = nbt.getString("CustomName");
		}
	}
	
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		
		nbt.setShort("BurnTime", (short)this.burnTime);
		nbt.setShort("CookTime", (short)this.cookTime);
		nbt.setShort("CurentItemBurnTime", (short)this.currentItemBurnTime);
		
		NBTTagList list = new NBTTagList();
		
		for(int i = 0; i < this.slots.length; i++) {
			if(this.slots[i] != null) {
				NBTTagCompound coumpound = new NBTTagCompound();
				coumpound.setByte("Slot", (byte)i);
				this.slots[i].writeToNBT(coumpound);
				list.appendTag(coumpound);
			}
		}
		
		nbt.setTag("Items", list);
		
		if(this.hasCustomInventoryName()) {
			nbt.setString("CustomName", this.localizedName);
		}
	}
}