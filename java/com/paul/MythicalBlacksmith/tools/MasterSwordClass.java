package com.paul.MythicalBlacksmith.tools;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class MasterSwordClass extends ItemSword {

	public MasterSwordClass(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setTextureName(MainClass.MODID + ":mastersword");
	}
	
	@Override
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    par1ItemStack.addEnchantment(Enchantment.sharpness, 8);

    }

}
