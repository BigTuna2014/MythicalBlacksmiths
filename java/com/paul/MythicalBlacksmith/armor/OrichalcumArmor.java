package com.paul.MythicalBlacksmith.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OrichalcumArmor extends ItemArmor {
	
	public OrichalcumArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(MainClass.MythicalBlacksmiths);
		
		if (placement == 0) {
			this.setTextureName(MainClass.MODID + ":ohelm");
		}
		else if (placement == 1) {
			this.setTextureName(MainClass.MODID + ":ochest");
		}
		else if (placement == 2) {
			this.setTextureName(MainClass.MODID + ":olegs");
		}
		else if (placement == 3) {
			this.setTextureName(MainClass.MODID + ":oboots");
		}
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == MainClass.OrichalcumHelmet || stack.getItem() == MainClass.OrichalcumChestplate || stack.getItem() == MainClass.OrichalcumBoots){
		return MainClass.MODID + ":textures/models/armor/ochest.png";
		}
		if (stack.getItem() == MainClass.OrichalcumLeggings) {
		return MainClass.MODID + ":textures/models/armor/oleggings.png";
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
		
		//Single Item Potion Effect
		if(player.getCurrentArmor(3) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			if (itemstack.getItem().equals(MainClass.OrichalcumHelmet)) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 1));
			}
		}
		
		if(player.getCurrentArmor(0) != null) {
			ItemStack boots = player.getCurrentArmor(0);
			if (boots.getItem() == MainClass.OrichalcumBoots) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 1));
			}
		}
		
		if(player.getCurrentArmor(1) != null) {
			ItemStack leggings = player.getCurrentArmor(1);
			if (leggings.getItem() == MainClass.OrichalcumLeggings) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 1));
			}
		}
		
		if(player.getCurrentArmor(2) != null) {
			ItemStack chestplate = player.getCurrentArmor(2);
			if (chestplate.getItem() == MainClass.OrichalcumChestplate) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 1));
			}
		}
	}
	
}
