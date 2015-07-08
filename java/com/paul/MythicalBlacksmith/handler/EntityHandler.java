package com.paul.MythicalBlacksmith.handler;

import net.minecraft.entity.EntityList;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.entity.EntityAdvancedAuto;
import com.paul.MythicalBlacksmith.entity.EntityAuto;
import com.paul.MythicalBlacksmith.entity.EntityByzantineGrenade;
import com.paul.MythicalBlacksmith.entity.EntityFriendlyAuto;
import com.paul.MythicalBlacksmith.entity.EntityMinotaur;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {

	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		createEntity(EntityAdvancedAuto.class, "TestMob", 0xE3AB05, 0xFF0000);
		createEntity(EntityMinotaur.class, "Minotaur", 0x702C01, 0xF7A572);
		createEntity(EntityAuto.class, "Auto", 0x6B6B6B, 0xFF0000);
		createEntity(EntityFriendlyAuto.class, "FriendlyAuto", 0x6B6B6B, 0x6B6B6B);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainClass.instance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}