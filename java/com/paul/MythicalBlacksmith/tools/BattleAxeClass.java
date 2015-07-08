package com.paul.MythicalBlacksmith.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.paul.MythicalBlacksmith.MainClass;

public class BattleAxeClass extends ItemAxe{
	
	public BattleAxeClass(ToolMaterial material) {
		super(material);
		setTextureName(MainClass.MODID + ":baxe");
	}
}