package com.paul.MythicalBlacksmith;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.paul.MythicalBlacksmith.entity.EntityApollosArrow;
import com.paul.MythicalBlacksmith.entity.EntityArtemisArrow;
import com.paul.MythicalBlacksmith.entity.EntityByzantineGrenade;
import com.paul.MythicalBlacksmith.render.RenderApollosArrow;
import com.paul.MythicalBlacksmith.render.RenderArtemisArrow;

public class CommonProxy {
	
	public void registerNetworkStuff(){
	 	}
	 
		public void registerTileEntities(){
		}
		
		public Map entityRenderMap = new HashMap();
		
		public void RenderManager() {
			
			 this.entityRenderMap.put(EntityByzantineGrenade.class, new RenderSnowball(MainClass.ByzantineGrenade));
			 this.entityRenderMap.put(EntityApollosArrow.class, new RenderApollosArrow());
			 this.entityRenderMap.put(EntityArtemisArrow.class, new RenderArtemisArrow());
			}
		
		public void registerRenderThings() {}
		public void registerSounds() {}
		
	 }