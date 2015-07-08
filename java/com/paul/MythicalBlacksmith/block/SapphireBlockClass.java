package com.paul.MythicalBlacksmith.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.paul.MythicalBlacksmith.MainClass;

public class SapphireBlockClass extends Block {

	public SapphireBlockClass(Material arg0) {
		super(arg0);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":sock");
	}
}
