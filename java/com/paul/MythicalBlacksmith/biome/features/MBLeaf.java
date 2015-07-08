package com.paul.MythicalBlacksmith.biome.features;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import scala.util.Random;

import com.paul.MythicalBlacksmith.MainClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MBLeaf extends BlockLeaves {
	
	public static final String[][] leaftypes = new String[][] {{"LeafOlive"}, {"LeafOliveOpaque"}};
	public static final String[] leaves = new String[] {"Olive"};
	
	 protected void func_150124_c(World world, int x, int y, int z, int side, int meta)
	    {
	        if ((side & 3) == 1 && world.rand.nextInt(meta) == 0)
	        {
	            this.dropBlockAsItem(world, x, y, z, new ItemStack(MainClass.foodOlive, 1, 0));
	        }
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
	 
	    public int damageDropped(int i)
	    {
	        return super.damageDropped(i) + 4;
	    }


	    public int getDamageValue(World world, int x, int y, int z)
	    {
	        return world.getBlockMetadata(x, y, z) & 3;
	    }

	   
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
	    {
	        for (int i = 0; i < leaves.length; i++) {
	        	list.add(new ItemStack(item, 1, i));
	        }
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        for (int i = 0; i < leaftypes.length; ++i)
	        {
	            this.field_150129_M[i] = new IIcon[leaftypes[i].length];

	            for (int j = 0; j < leaftypes[i].length; ++j)
	            {
	                this.field_150129_M[i][j] = iconRegister.registerIcon(MainClass.MODID + ":" + leaftypes[i][j]);
	            }
	        }
	    }

	@Override
	public IIcon getIcon(int side, int meta) {
		return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
	}

	@Override
	public String[] func_150125_e() {
		return leaves;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
		@Override
		public boolean shouldSideBeRendered(IBlockAccess blockaccess, int x, int y, int z, int side) {
			return true;
		}
}
