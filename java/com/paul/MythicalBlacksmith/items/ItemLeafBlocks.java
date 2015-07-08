package com.paul.MythicalBlacksmith.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;

public class ItemLeafBlocks extends ItemBlock{
	
	public static final String[] leaves = new String[] {"Olive"};

	public ItemLeafBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= leaves.length) {
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + leaves[i];
	}
	
	public Block idDropped(int i, Random random)
    {
        if(random.nextInt(1) == 0)
        {
        return MainClass.blockSapling;
        } else   
        {
            return null;
        }
    }
	
	public int getMetadata (int meta) {
		return meta;
	}

}
