package com.paul.MythicalBlacksmith.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent.SetArmorModel;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ArmorHandler {
	
	@SubscribeEvent
	public void onArmorEvent(SetArmorModel event) {
	if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {
	if (((EntityPlayer) event.entity).isInvisible())
	event.result = -1;
	}
	}
}