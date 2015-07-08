package com.paul.MythicalBlacksmith.throwables;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.MainClass;
import com.paul.MythicalBlacksmith.entity.EntityFlameThrower;

public class ByzantineFlamethrowerClass extends Item
{
    World world;
    public ByzantineFlamethrowerClass()
    {
        this.maxStackSize = 1;
 
    }
 
	int durability = 300;
    
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
    	
    	if(durability == 0) {
    		if(player.inventory.hasItem(MainClass.NaphthaBucket)) {
    			player.inventory.consumeInventoryItem(MainClass.NaphthaBucket);
    			player.inventory.addItemStackToInventory(new ItemStack(Items.bucket, 1));
    			durability = 300;
    			
    		}
    	}

    	if(durability >= 1) {
    	
    	Vec3 position = Vec3.createVectorHelper(player.posX, player.posY + player.getEyeHeight(), player.posZ);
		Vec3 look = player.getLookVec();
		MovingObjectPosition object = world.rayTraceBlocks(position, look);

		double dxMin = (double)((float)player.posX + look.xCoord * 1);
		double dyMin = (double)((float)player.posY + player.eyeHeight + look.yCoord * 1);
		double dzMin = (double)((float)player.posZ + look.zCoord * 1);
		
		for(int l = 0; l <= 5; l++)
		     for(int j = -1; j <= 1; j++)
		       for(int k = 0; k <= 5; k++) {
		    	   
		world.spawnParticle("flame", dxMin, dyMin, dzMin, look.xCoord * 0.05 * l,  look.yCoord * 0.05 * j, look.zCoord * 0.05 * k);
		       }
        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
 
        if (!world.isRemote)
        {
                 if (!world.isRemote)
 
             {
                for(int i = 0; i != 20; i++)
                {
 
                      world.spawnEntityInWorld(new EntityFlameThrower(world, player));
                     durability--;
                }
             }
        }
    	}
        return item;
   
}
}