package com.paul.MythicalBlacksmith.block;

import java.util.Random;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyOreClass extends Block {

	public RubyOreClass(Material arg0) {
		super(arg0);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":rore");
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return MainClass.Ruby;
	}

}
