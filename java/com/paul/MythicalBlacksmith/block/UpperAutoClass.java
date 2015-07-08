package com.paul.MythicalBlacksmith.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.entity.EntityFriendlyAuto;

public class UpperAutoClass extends Block {

	public UpperAutoClass(Material arg0) {
		super(arg0);
		setHardness(3F);
		setResistance(1.5F);
		setBlockTextureName(MainClass.MODID + ":upauto");
	}

	public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);

        if (world.getBlock(x, y - 1, z) == MainClass.LowerAuto) {
            
        	if (!world.isRemote)
            {
                world.setBlock(x, y, z, getBlockById(0), 0, 2);
                world.setBlock(x, y - 1, z, getBlockById(0), 0, 2);
                EntityFriendlyAuto entityauto = new EntityFriendlyAuto(world);
                entityauto.setLocationAndAngles((double)x + 0.5D, (double)y - .95D, (double)z + 0.5D, 0.0F, 0.0F);
                world.spawnEntityInWorld(entityauto);
                world.notifyBlockChange(x, y, z, getBlockById(0));
                world.notifyBlockChange(x, y - 1, z, getBlockById(0));
            }
        }
    }
	
}