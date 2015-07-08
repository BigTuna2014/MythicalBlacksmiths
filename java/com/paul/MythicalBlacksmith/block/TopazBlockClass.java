package com.paul.MythicalBlacksmith.block;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TopazBlockClass extends Block{

	public TopazBlockClass(Material p_i45394_1_) {
		super(p_i45394_1_);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":tblock");
	}
		
	}