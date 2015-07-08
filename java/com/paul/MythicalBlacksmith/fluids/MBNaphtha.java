package com.paul.MythicalBlacksmith.fluids;

import java.io.IOException;
import java.util.Random;

import com.paul.MythicalBlacksmith.MainClass;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
public class MBNaphtha extends BlockFluidClassic {

	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	
	public MBNaphtha() {
		super(MainClass.NaphthaFluid, Material.water);
		this.setCreativeTab(MainClass.MythicalBlacksmiths);
		
	}

	  @EventHandler // used in 1.6.2
      public void preInit(FMLPreInitializationEvent event) throws IOException{ 

		  MainClass.NaphthaFluid.setIcons(blockIcon).setBlock(MainClass.NaphthaBlock);
      }
	  
	  @Override
      public IIcon getIcon(int side, int meta) {
              return (side == 0 || side == 1)? stillIcon : flowingIcon;
      }
	  
	  @SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister iconRegister){
		  this.blockIcon = iconRegister.registerIcon(MainClass.MODID + ":water_still");
			this.flowingIcon = iconRegister.registerIcon(MainClass.MODID + ":water_flow");
			this.stillIcon = iconRegister.registerIcon(MainClass.MODID + ":water_still");


		}
	  
	  public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
		  if(entity.isBurning()) {
			  
			  world.createExplosion(entity, x, y, z, 3.0F, true);
		  }	  
	  }
	  }