package com.paul.MythicalBlacksmith.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.handler.BucketHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class Register {
	
	public static void addFluidRegistrations(){

    	FluidRegistry.registerFluid(MainClass.NaphthaFluid);
		
	}
	
	public static void addEventRegistrations(){

    	MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		
    }

	
	public static void addFluidContainerRegistrations(){

    	FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("naphtha", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(MainClass.NaphthaBucket), new ItemStack(Items.bucket));
		
    }
	
	public static void addBlockRegistrations(){

    	GameRegistry.registerBlock(MainClass.NaphthaBlock, "NaphthaBlock");
		
    }
	
	public static void addItemRegistrations(){

    	GameRegistry.registerItem(MainClass.NaphthaBucket , "NapthaBucket");
		
    }

	
}