package com.paul.MythicalBlacksmith.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.TileEntity.TileEntitySHFurnace;
import com.paul.MythicalBlacksmith.container.ContainerSHFurnace;
import com.paul.MythicalBlacksmith.gui.GuiSHFurnace;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case MainClass.guiIDSHFurnace:
				if (entity instanceof TileEntitySHFurnace) {
					return new ContainerSHFurnace(player.inventory, (TileEntitySHFurnace) entity);
				}
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case MainClass.guiIDSHFurnace:
				if (entity instanceof TileEntitySHFurnace) {
					return new GuiSHFurnace(player.inventory, (TileEntitySHFurnace) entity);
				}
				return null;
			}
		}
		return null;
	}

}
