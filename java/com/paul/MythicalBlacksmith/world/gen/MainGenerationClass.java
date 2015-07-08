package com.paul.MythicalBlacksmith.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.world.gen.biome.BiomesMB;
import com.paul.MythicalBlacksmith.world.gen.feature.NetherGenMinable;
import com.paul.MythicalBlacksmith.world.gen.feature.WorldGenOliveTree;

import cpw.mods.fml.common.IWorldGenerator;

public class MainGenerationClass implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverWorld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			EndGenMinable(world, random, chunkX*16, chunkZ*16);
			break;
		}
		
	}
	//i < X is the Rarity
				
	
	private void generateInNether(World world, Random random, int x, int z) {
		
		for(int i = 0; i < 1; i++) { 
			int ChunkX = x + random.nextInt(16);
			int ChunkY = random.nextInt(30);
			int ChunkZ = z + random.nextInt(16);
			
			(new NetherGenMinable(MainClass.OrichalcumOre, 7)).generate(world, random, ChunkX, ChunkY, ChunkZ);
		}
		
		for(int i = 0; i < 20; i++) { 
			int ChunkX = x + random.nextInt(16);
			int ChunkY = random.nextInt(240);
			int ChunkZ = z + random.nextInt(16);
			
			(new NetherGenMinable(MainClass.SilverOre, 7)).generate(world, random, ChunkX, ChunkY, ChunkZ);
		}
		
	}

	private void generateInOverWorld(World world, Random random, int x, int z) {
		
		for(int i = 0; i < 1; i++) { 
			int ChunkX = x + random.nextInt(16);
			int ChunkY = random.nextInt(35);
			int ChunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(MainClass.NaphthaBlock, 30)).generate(world, random, ChunkX, ChunkY, ChunkZ);
		}
		
		String s = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (s.startsWith("Latin Fields")) {
		for(int i = 0; i < random.nextInt(5); i++){
			int ChunkX = x + random.nextInt(16);
			int ChunkY = random.nextInt(240);
			int ChunkZ = z + random.nextInt(16);
			
			(new WorldGenOliveTree(false, 6, 0, 0, false)).generate(world, random, ChunkX, ChunkY, ChunkZ);
			}
		}
		
		for(int i = 0; i < 1; i++) { 
			int ChunkX = x + random.nextInt(16);
			int ChunkY = random.nextInt(16);
			int ChunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(MainClass.MythrilOre, 7)).generate(world, random, ChunkX, ChunkY, ChunkZ);
		}
		
		for(int i = 0; i < 1; i++) { 
			int ChunkX = x + random.nextInt(16);
			int ChunkY = random.nextInt(20);
			int ChunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(MainClass.RubyOre, 7)).generate(world, random, ChunkX, ChunkY, ChunkZ);
		}
		
		String s9 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (s.startsWith("Ocean"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.SapphireOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
			
		}
			
			String s1 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
			if (s1.startsWith("DeepOcean"))
			{
				for(int i = 0; i < 1; i++) {
					int CHunkX = x + random.nextInt(16);
					int CHunkY = random.nextInt(28) + 4;
					int CHunkZ = z + random.nextInt(16);
					
					(new WorldGenMinable(MainClass.SapphireOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
				}
		}
		
		String s2 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (s2.startsWith("FrozenOcean"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.SapphireOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String t = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (t.startsWith("Desert"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.TopazOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String t1 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (t1.startsWith("DesertHills"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.TopazOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String a = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (a.startsWith("IceMountains"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.AmethystOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String a1 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (a1.startsWith("IcePlains"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.AmethystOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String a2 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (a2.startsWith("FrozenOcean"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.AmethystOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String o = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (o.startsWith("IcePlains"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.OpalOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
		
		String o1 = world.getBiomeGenForCoords(x + 8, z + 8).biomeName;
		if (o1.startsWith("Plains"))
		{
			for(int i = 0; i < 1; i++) {
				int CHunkX = x + random.nextInt(16);
				int CHunkY = random.nextInt(28) + 4;
				int CHunkZ = z + random.nextInt(16);
				
				(new WorldGenMinable(MainClass.OpalOre, 1)).generate(world, random, CHunkX, CHunkY, CHunkZ);
			}
		}
	}

	private void EndGenMinable(World world, Random random, int x, int z) {
		
	}
}