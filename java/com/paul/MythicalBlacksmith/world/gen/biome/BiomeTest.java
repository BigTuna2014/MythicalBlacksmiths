package com.paul.MythicalBlacksmith.world.gen.biome;

import com.paul.MythicalBlacksmith.world.gen.feature.WorldGenOliveTree;

import scala.util.Random;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeTest extends BiomeGenBase {

	private static final Height biomeHeight = new Height(0.1F, 0.2F);
	
	public BiomeTest(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(8826273);
		this.setTemperatureRainfall(0.9F, 1.0F);
		this.waterColorMultiplier = 1450657;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random random)
	{
	return (WorldGenerator)new WorldGenOliveTree(false, 1, 0, 0, false);
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z) {
		return 8826273;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z) {
		return 4101697;
	}
	
	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}
	
}
