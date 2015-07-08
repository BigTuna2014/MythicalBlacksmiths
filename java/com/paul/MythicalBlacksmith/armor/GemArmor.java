package com.paul.MythicalBlacksmith.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;

public class GemArmor extends ItemArmor {
	
	public GemArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(MainClass.MythicalBlacksmiths);
		
		if (placement == 0) {
			this.setTextureName(MainClass.MODID + ":ghelm");
		}
		else if (placement == 1) {
			this.setTextureName(MainClass.MODID + ":gchest");
		}
		else if (placement == 2) {
			this.setTextureName(MainClass.MODID + ":glegs");
		}
		else if (placement == 3) {
			this.setTextureName(MainClass.MODID + ":gboots");
		}
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == MainClass.SapphireHelmet || stack.getItem() == MainClass.OpalChestplate || stack.getItem() == MainClass.AmethystBoots){
		return MainClass.MODID + ":textures/models/armor/gchest.png";
		}
		if (stack.getItem() == MainClass.TopazLeggings) {
		return MainClass.MODID + ":textures/models/armor/gleggings.png";
		} else{
			return null;
		}
		
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
    {	
		//3 Is Helmet
		//2 Is Chestplate
		//1 Is Leggings
		//0 Is Boots
		if(player.getCurrentArmor(3) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			if (itemstack.getItem().equals(MainClass.SapphireHelmet)) {
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10, 1));
			}
		}
		if(player.getCurrentArmor(2) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			if (itemstack.getItem().equals(MainClass.OpalChestplate)) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 4));
			}
		}
		if(player.getCurrentArmor(1) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			if (itemstack.getItem().equals(MainClass.TopazLeggings)) {
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 4));
			}
		}
		if(player.getCurrentArmor(1) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			if (itemstack.getItem().equals(MainClass.TopazLeggings)) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 4));
			}
		}
		   int x = (int) player.posX;
		   int y = (int) (player.posY - 0.5D);
		   int z = (int) player.posZ;

		   if(itemstack.getItem() != MainClass.AmethystBoots) return;

		   for(int i = -5; i <= 5; i++)
		     for(int j = -5; j <= 5; j++)
		       for(int k = -1; k <= 1; k++){
		    	   		if(world.getBlock(x-i, y-k, z-j) == Blocks.water)
		    	   			   world.setBlock(x-i, y-k, z-j, Blocks.ice);
		    	   		if(world.getBlock(x-i, y-k, z-j) == Blocks.lava)
		    	   			   world.setBlock(x-i, y-k, z-j, Blocks.obsidian);
		       

    }
    }
    
}