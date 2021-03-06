package com.paul.MythicalBlacksmith.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.entity.EntityByzantineGrenade;

public class ByzantineGrenadeClass extends Item {
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if(!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.fizz", 0.7F, 0.8F);
	
		if(!world.isRemote) {
			world.spawnEntityInWorld(new EntityByzantineGrenade(world, player));
		}
		
		return itemstack;
	}
	
}
