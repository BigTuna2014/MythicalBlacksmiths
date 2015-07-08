package com.paul.MythicalBlacksmith.CreativeTabs;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MythicalBlacksmiths extends CreativeTabs {

	public MythicalBlacksmiths(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public Item getTabIconItem() {
		return MainClass.tabpic;
	}

}
