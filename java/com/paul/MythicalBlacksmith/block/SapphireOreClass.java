package com.paul.MythicalBlacksmith.block;

import java.util.Random;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SapphireOreClass extends Block {

	public SapphireOreClass(Material arg0) {
		super(arg0);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":sore");
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return MainClass.Sapphire;
	}
	
}
