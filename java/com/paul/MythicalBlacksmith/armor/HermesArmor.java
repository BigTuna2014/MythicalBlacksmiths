package com.paul.MythicalBlacksmith.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class HermesArmor extends ItemArmor {
	
	public HermesArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(MainClass.MythicalBlacksmiths);
		
		if (placement == 3)
		 {
			this.setTextureName(MainClass.MODID + ":hboots");
		}
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == MainClass.HermesBoots){
		return MainClass.MODID + ":textures/models/armor/hchest.png";
		} else{
			return null;
		}
		
	}
	
	boolean allowFlying = false;
	
	int i = 1;
	
	@Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack) {
        ItemStack bootStack = player.getCurrentArmor(0);

       
        if (bootStack != null) {
                if (bootStack.getItem() == MainClass.HermesBoots) {
                        player.capabilities.allowFlying = true;
                } else {
                    player.capabilities.allowFlying = false;
                    player.capabilities.isFlying = false;
            }
        } else {
            player.capabilities.allowFlying = false;
            player.capabilities.isFlying = false;
    }
        
}

}