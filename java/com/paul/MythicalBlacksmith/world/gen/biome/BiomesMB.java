package com.paul.MythicalBlacksmith.world.gen.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class BiomesMB {

	public static BiomeGenBase biomeTest;
	
	public static void init() {
		registerBiomes();
	}
	
	private static void registerBiomes() {
		biomeTest = new BiomeTest(50).setBiomeName("Latin Fields");
		BiomeDictionary.registerBiomeType(biomeTest, Type.PLAINS);
		BiomeManager.warmBiomes.add(new BiomeEntry(biomeTest, 10));
		
		BiomeManager.removeSpawnBiome(BiomeGenBase.beach);
		BiomeManager.removeSpawnBiome(BiomeGenBase.birchForest);
		BiomeManager.removeSpawnBiome(BiomeGenBase.birchForestHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.coldBeach);
		BiomeManager.removeSpawnBiome(BiomeGenBase.coldTaiga);
		BiomeManager.removeSpawnBiome(BiomeGenBase.coldTaigaHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.deepOcean);
		BiomeManager.removeSpawnBiome(BiomeGenBase.desert);
		BiomeManager.removeSpawnBiome(BiomeGenBase.desertHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.extremeHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.extremeHillsEdge);
		BiomeManager.removeSpawnBiome(BiomeGenBase.extremeHillsPlus);
		BiomeManager.removeSpawnBiome(BiomeGenBase.forest);
		BiomeManager.removeSpawnBiome(BiomeGenBase.forestHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.frozenOcean);
		BiomeManager.removeSpawnBiome(BiomeGenBase.frozenRiver);
		BiomeManager.removeSpawnBiome(BiomeGenBase.hell);
		BiomeManager.removeSpawnBiome(BiomeGenBase.iceMountains);
		BiomeManager.removeSpawnBiome(BiomeGenBase.icePlains);
		BiomeManager.removeSpawnBiome(BiomeGenBase.jungle);
		BiomeManager.removeSpawnBiome(BiomeGenBase.jungleEdge);
		BiomeManager.removeSpawnBiome(BiomeGenBase.jungleHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.megaTaiga);
		BiomeManager.removeSpawnBiome(BiomeGenBase.megaTaigaHills);
		BiomeManager.removeSpawnBiome(BiomeGenBase.mesa);
		BiomeManager.removeSpawnBiome(BiomeGenBase.mesaPlateau);
		BiomeManager.removeSpawnBiome(BiomeGenBase.mesaPlateau_F);
		BiomeManager.removeSpawnBiome(BiomeGenBase.mushroomIsland);
		BiomeManager.removeSpawnBiome(BiomeGenBase.mushroomIslandShore);
		BiomeManager.removeSpawnBiome(BiomeGenBase.ocean);
		BiomeManager.removeSpawnBiome(BiomeGenBase.plains);
		BiomeManager.removeSpawnBiome(BiomeGenBase.river);
		BiomeManager.removeSpawnBiome(BiomeGenBase.roofedForest);
		BiomeManager.removeSpawnBiome(BiomeGenBase.savanna);
		BiomeManager.removeSpawnBiome(BiomeGenBase.savannaPlateau);
		BiomeManager.removeSpawnBiome(BiomeGenBase.sky);
		BiomeManager.removeSpawnBiome(BiomeGenBase.stoneBeach);
		BiomeManager.removeSpawnBiome(BiomeGenBase.swampland);
		BiomeManager.removeSpawnBiome(BiomeGenBase.taiga);
		BiomeManager.removeSpawnBiome(BiomeGenBase.taigaHills);
		
		BiomeManager.addSpawnBiome(biomeTest);
	}
}
