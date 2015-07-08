package com.paul.MythicalBlacksmith.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.paul.MythicalBlacksmith.MainClass;

public class LowerAutoClass extends Block {

	public LowerAutoClass(Material arg0) {
		super(arg0);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":loauto");
	}
}
