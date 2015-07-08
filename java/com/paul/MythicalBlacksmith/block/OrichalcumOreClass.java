package com.paul.MythicalBlacksmith.block;

import java.util.Random;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OrichalcumOreClass extends Block {

	public OrichalcumOreClass(Material arg0) {
		super(arg0);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":oreo");
	}

}
