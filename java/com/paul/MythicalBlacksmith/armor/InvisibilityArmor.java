package com.paul.MythicalBlacksmith.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;

public class InvisibilityArmor extends ItemArmor {
	
	public InvisibilityArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(MainClass.MythicalBlacksmiths);

		 if (placement == 0) {
			this.setTextureName(MainClass.MODID + ":icloak");
		}

	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == MainClass.InvisibilityCloak){
		return MainClass.MODID + ":textures/models/armor/icloak.png";
		} else{
			return null;
		}
		
	}
	
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
    {	
		if(player.getCurrentArmor(3) != null) {
			ItemStack chestplate = player.getCurrentArmor(3);
			if (chestplate.getItem() == MainClass.InvisibilityCloak) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10, 1));
			}
		}
    }
}