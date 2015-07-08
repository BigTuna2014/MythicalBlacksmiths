package com.paul.MythicalBlacksmith.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.entity.EntityAdvancedAuto;
import com.paul.MythicalBlacksmith.entity.EntityFriendlyAuto;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFriendlyAuto extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation(MainClass.MODID + ":textures/entity/frendlyauto.png");
    private static final String __OBFID = "CL_00000984";

    public RenderFriendlyAuto(ModelBase base, float par1)
    {
        super(base, par1);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityFriendlyAuto testMob)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((EntityFriendlyAuto)entity);
    }
}