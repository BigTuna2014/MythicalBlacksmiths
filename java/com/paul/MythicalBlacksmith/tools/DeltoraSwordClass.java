package com.paul.MythicalBlacksmith.tools;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;

public class DeltoraSwordClass extends ItemSword {

	public DeltoraSwordClass(ToolMaterial material) {
		super(material);
		setTextureName(MainClass.MODID + ":deltorasword");
	}
	
	@Override
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    par1ItemStack.addEnchantment(Enchantment.smite, 10);

    }
}