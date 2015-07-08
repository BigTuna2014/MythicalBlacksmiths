package com.paul.MythicalBlacksmith;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;

import com.paul.MythicalBlacksmith.entity.EntityAdvancedAuto;
import com.paul.MythicalBlacksmith.entity.EntityApollosArrow;
import com.paul.MythicalBlacksmith.entity.EntityArtemisArrow;
import com.paul.MythicalBlacksmith.entity.EntityAuto;
import com.paul.MythicalBlacksmith.entity.EntityByzantineGrenade;
import com.paul.MythicalBlacksmith.entity.EntityFriendlyAuto;
import com.paul.MythicalBlacksmith.entity.EntityMinotaur;
//import com.paul.MythicalBlacksmith.render.RenderGreekFire;
import com.paul.MythicalBlacksmith.render.RenderAdvancedAuto;
import com.paul.MythicalBlacksmith.render.RenderApollosArrow;
import com.paul.MythicalBlacksmith.render.RenderArtemisArrow;
import com.paul.MythicalBlacksmith.render.RenderAuto;
import com.paul.MythicalBlacksmith.render.RenderFriendlyAuto;
import com.paul.MythicalBlacksmith.render.RenderMinotaur;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderInfo() {
	}
	
	public void registerRenderThing() {
		RenderingRegistry.registerEntityRenderingHandler(EntityByzantineGrenade.class, new RenderSnowball(MainClass.ByzantineGrenade));
		RenderingRegistry.registerEntityRenderingHandler(EntityArtemisArrow.class, new RenderArtemisArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityApollosArrow.class, new RenderApollosArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityAdvancedAuto.class, new RenderAdvancedAuto(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new RenderMinotaur(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityAuto.class, new RenderAuto(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFriendlyAuto.class, new RenderFriendlyAuto(new ModelBiped(), 0));
	}
	
	@Override
	public void registerSounds() {}
	
}
