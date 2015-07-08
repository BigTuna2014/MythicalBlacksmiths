package com.paul.MythicalBlacksmith.world.gen.feature;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.structure.StructureBoundingBox;

import com.paul.MythicalBlacksmith.MainClass;

public class WorldGenOliveTree extends WorldGenAbstractTree {

    private final int minTreeHeight;

    private final boolean vinesGrow;

    private final int metaWood;

    private final int metaLeaves;
	
	public WorldGenOliveTree(boolean par1, int par2, int par3, int par4, boolean par5)
    {
        super(par1);
        this.minTreeHeight = par2;
        this.metaWood = par3;
        this.metaLeaves = par4;
        this.vinesGrow = par5;
    }

//	public WorldGenOliveTree() {
	//	super(false);
	//}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {

		while (world.isAirBlock(x, y, z) && y > 2) {
			y--;
		}
		
		Block block = world.getBlock(x, y, z);
		Block block1 = world.getBlock(x, y, z + 1);
		
		if (block != Blocks.grass && block != Blocks.dirt && block1 != Blocks.dirt && block1 != Blocks.grass) {
			return false;
		}else{
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (world.isAirBlock(x + i, y - 1, z + j) && world.isAirBlock(x + i, y - 2, z + j) && !world.isAirBlock(x + i, y, z + j)) {
						return false;
					}
				}
			}
			
			int baselength = 2 + random.nextInt(1);
			int branches = 0;
			
			int h = 1;
			
			block.onPlantGrow(world, x, y - 1, z, x, y, z);
			block1.onPlantGrow(world, x, y - 1, z + 1, x, y, z);
			
			for (int i = 0; i < baselength; i++) {
				buildBlock(world, x, y + h, z, MainClass.blockLog, 0);
				buildBlock(world, x, y + h, z + 1, MainClass.blockLog, 0);
				buildBlock(world, x - 1, y + 3, z, MainClass.blockLog, 0);
				buildBlock(world, x - 1, y + 4, z - 1, MainClass.blockLog, 0);
				buildBlock(world, x - 2, y + 5, z - 1, MainClass.blockLog, 0);
				buildBlock(world, x + 1, y + 3, z, MainClass.blockLog, 0);
				buildBlock(world, x + 1, y + 4, z, MainClass.blockLog, 0);
				buildBlock(world, x + 2, y + 5, z, MainClass.blockLog, 0);
				buildBlock(world, x, y + 3, z + 2, MainClass.blockLog, 0);
				buildBlock(world, x, y + 3, z + 3, MainClass.blockLog, 0);
				buildBlock(world, x, y + 4, z + 4, MainClass.blockLog, 0);
				h++;
			}
			
			int c = 1;
			for (int i = 0; i < branches; i++) {
				generateBranch(world, random, x, y + h, z, c);
				c++;
				h+=2;
			}
			
			generateTop(world, x, y + h, z);
			return true;
		}
		
	}

	public void generateTop(World world, int x, int y, int z) {
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				buildBlock(world, x, y + 2, z, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 3, y + 2, z, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z + 4, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z + 5, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z + 4, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z + 4, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 2, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 2, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 2, z, MainClass.blockLeaf, 0);
				buildBlock(world, x - 3, y + 2, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 3, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 3, y + 2, z, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 2, z - 2, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 2, z - 2, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 2, z - 2, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 2, z - 2, MainClass.blockLeaf, 0);
				buildBlock(world, x + 2, y + 2, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 3, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 2, y + 2, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 2, y + 2, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x + 2, y + 2, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 3, z, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 3, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 3, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 3, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 3, z + 4, MainClass.blockLeaf, 0);
				buildBlock(world, x, y + 3, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 3, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 3, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 3, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 3, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x + 1, y + 3, z, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 3, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 3, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 3, z + 2, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 3, z + 3, MainClass.blockLeaf, 0);
				buildBlock(world, x - 1, y + 3, z, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 3, z, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 3, z - 1, MainClass.blockLeaf, 0);
				buildBlock(world, x - 2, y + 3, z + 1, MainClass.blockLeaf, 0);
				buildBlock(world, x + 2, y + 3, z, MainClass.blockLeaf, 0);
				buildBlock(world, x + 2, y + 3, z + 1, MainClass.blockLeaf, 0);
				
				
			}
		}
	}
	
	public void generateBranch(World world, Random random, int x, int y, int z, int p) {
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
			}
		}

	}

	public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
		if (world.isAirBlock(x, y, z)|| world.getBlock(x, y, z).isLeaves(world, x, y, z)) {
			world.setBlock(x, y, z, block, meta, 2);
		}
		
	}
}