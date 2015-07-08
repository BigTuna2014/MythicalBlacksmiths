package com.paul.MythicalBlacksmith.armor;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MythrilArmor extends ItemArmor{

	public MythrilArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(MainClass.MythicalBlacksmiths);
		if (placement == 0) {
			this.setTextureName(MainClass.MODID + ":mhelm");
		}
		else if (placement == 1) {
			this.setTextureName(MainClass.MODID + ":mchest");
		}
		else if (placement == 2) {
			this.setTextureName(MainClass.MODID + ":mlegs");
		}
		else if (placement == 3) {
			this.setTextureName(MainClass.MODID + ":mboots");
		}
	}
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
			if (stack.getItem() == MainClass.MythrilHelmet || stack.getItem() == MainClass.MythrilChestplate || stack.getItem() == MainClass.MythrilBoots){
			return MainClass.MODID + ":textures/models/armor/mchest.png";
			}
			if (stack.getItem() == MainClass.MythrilLeggings) {
			return MainClass.MODID + ":textures/models/armor/mleggings.png";
			} else{
				return null;
			}
			
		}
		
	}
