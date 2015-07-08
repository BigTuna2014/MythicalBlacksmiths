package com.paul.MythicalBlacksmith.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.TileEntity.TileEntitySHFurnace;
import com.paul.MythicalBlacksmith.container.ContainerSHFurnace;

public class GuiSHFurnace extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(MainClass.MODID + ":textures/gui/SHGui.png");
	
	public TileEntitySHFurnace SHFurnace;
	
	public GuiSHFurnace(InventoryPlayer inventoryPlayer, TileEntitySHFurnace entity) {
		super(new ContainerSHFurnace(inventoryPlayer, entity));
		
		this.SHFurnace = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Super Heated Furnace";
	
		 this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
	        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	    }

	    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
	    {
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(bground);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

	        if (this.SHFurnace.isBurning())
	        {
	            int i1 = this.SHFurnace.getBurnTimeRemainingScaled(13);
	            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
	            i1 = this.SHFurnace.getCookProgressScaled(24);
	            this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
	        }
	    }
	}