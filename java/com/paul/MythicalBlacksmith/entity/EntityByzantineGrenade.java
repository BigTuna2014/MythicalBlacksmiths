package com.paul.MythicalBlacksmith.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityByzantineGrenade extends EntityThrowable {

	public EntityByzantineGrenade(World world) {
		super(world);
	}
	public EntityByzantineGrenade(World world, EntityLivingBase entity) {
		super(world, entity);
	}
	
	@Override
	protected void onImpact(MovingObjectPosition object) {
		
		if(object.entityHit != null)
		{
			
			object.entityHit.setFire(2000);
			
		}
		
		for(int i = 0; i < 10; i++) {
			this.worldObj.spawnParticle("largesmoke", this.posX, this.posY, this.posZ, 0.1F, 0.1F, 0.1F);

		}
		
		if(!this.worldObj.isRemote) {
			this.setDead();
			if(!this.worldObj.isRemote) {
				int x = (int)this.posX;
				int y = (int)this.posY;
				int z = (int)this.posZ;
				
				worldObj.setBlock(x, y, z, Blocks.fire);
				
				if(worldObj.getBlock(x, y, z + 1) == Blocks.air) {
					worldObj.setBlock(x , y, z + 1, Blocks.fire);
				}else if(worldObj.getBlock(x , y + 1, z + 1) == Blocks.air) {
					worldObj.setBlock(x , y + 1, z + 1, Blocks.fire);
				}
				if(worldObj.getBlock(x + 1, y, z + 1) == Blocks.air) {
					worldObj.setBlock(x + 1, y, z + 1, Blocks.fire);
				}else if(worldObj.getBlock(x + 1, y - 1, z + 1) == Blocks.air) {
					worldObj.setBlock(x + 1, y - 1, z + 1, Blocks.fire);
				}
				if(worldObj.getBlock(x - 1, y, z + 1) == Blocks.air) {
					worldObj.setBlock(x - 1, y, z + 1, Blocks.fire);
				}else if(worldObj.getBlock(x - 1, y + 1, z + 1) == Blocks.air) {
					worldObj.setBlock(x - 1, y + 1, z + 1, Blocks.fire);
				}
				if(worldObj.getBlock(x, y, z + 2) == Blocks.air) {
					worldObj.setBlock(x, y, z + 2, Blocks.fire);
				}else if(worldObj.getBlock(x, y + 1, z + 2) == Blocks.air) {
					worldObj.setBlock(x, y + 1, z + 2, Blocks.fire);
				}
				if(worldObj.getBlock(x + 1, y, z) == Blocks.air) {
					worldObj.setBlock(x + 1, y, z, Blocks.fire);
				}else if(worldObj.getBlock(x + 1, y + 1, z) == Blocks.air) {
					worldObj.setBlock(x + 1, y + 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x + 2, y, z) == Blocks.air) {
					worldObj.setBlock(x + 2, y, z, Blocks.fire);
				}else if(worldObj.getBlock(x + 2, y + 1, z) == Blocks.air) {
					worldObj.setBlock(x + 2, y + 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x - 1, y, z) == Blocks.air) {
					worldObj.setBlock(x - 1, y, z, Blocks.fire);
				}else if(worldObj.getBlock(x - 1, y + 1, z) == Blocks.air) {
					worldObj.setBlock(x - 1, y + 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x - 2, y, z) == Blocks.air) {
					worldObj.setBlock(x - 2, y, z, Blocks.fire);
				}else if(worldObj.getBlock(x - 2, y + 1, z) == Blocks.air) {
					worldObj.setBlock(x - 2, y + 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x, y, z - 1) == Blocks.air) {
					worldObj.setBlock(x, y, z - 1, Blocks.fire);
				}else if(worldObj.getBlock(x, y + 1, z - 1) == Blocks.air) {
					worldObj.setBlock(x, y + 1, z - 1, Blocks.fire);
				}
				if(worldObj.getBlock(x - 1, y, z - 1) == Blocks.air) {
					worldObj.setBlock(x - 1, y, z - 1, Blocks.fire);
				} else if(worldObj.getBlock(x - 1, y + 1, z - 1) == Blocks.air) {
					worldObj.setBlock(x - 1, y + 1, z - 1, Blocks.fire);
				}
				if(worldObj.getBlock(x, y, z - 2) == Blocks.air) {
					worldObj.setBlock(x, y, z - 2, Blocks.fire);
				}else if(worldObj.getBlock(x, y + 1, z - 2) == Blocks.air) {
					worldObj.setBlock(x, y + 1, z - 2, Blocks.fire);
				}
				if(worldObj.getBlock(x + 1, y, z - 1) == Blocks.air) {
					worldObj.setBlock(x + 1, y, z - 1, Blocks.fire);
				} else if(worldObj.getBlock(x + 1, y + 1, z - 1) == Blocks.air) {
					worldObj.setBlock(x + 1, y + 1, z - 1, Blocks.fire);
				}
				
				if(worldObj.getBlock(x , y - 1, z + 1) == Blocks.air) {
					worldObj.setBlock(x , y - 1, z + 1, Blocks.fire);
				}
				if(worldObj.getBlock(x + 1, y + 1, z + 1) == Blocks.air) {
					worldObj.setBlock(x + 1, y + 1, z + 1, Blocks.fire);
				}
				if(worldObj.getBlock(x - 1, y - 1, z + 1) == Blocks.air) {
					worldObj.setBlock(x - 1, y - 1, z + 1, Blocks.fire);
				}
				if(worldObj.getBlock(x, y - 1, z + 2) == Blocks.air) {
					worldObj.setBlock(x, y - 1, z + 2, Blocks.fire);
				}
				if(worldObj.getBlock(x + 1, y - 1, z) == Blocks.air) {
					worldObj.setBlock(x + 1, y - 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x + 2, y - 1, z) == Blocks.air) {
					worldObj.setBlock(x + 2, y - 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x - 1, y - 1, z) == Blocks.air) {
					worldObj.setBlock(x - 1, y - 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x - 2, y - 1, z) == Blocks.air) {
					worldObj.setBlock(x - 2, y - 1, z, Blocks.fire);
				}
				if(worldObj.getBlock(x, y - 1, z - 1) == Blocks.air) {
					worldObj.setBlock(x, y - 1, z - 1, Blocks.fire);
				}
				if(worldObj.getBlock(x - 1, y - 1, z - 1) == Blocks.air) {
					worldObj.setBlock(x - 1, y - 1, z - 1, Blocks.fire);
				}
				if(worldObj.getBlock(x, y - 1, z - 2) == Blocks.air) {
					worldObj.setBlock(x, y - 1, z - 2, Blocks.fire);
				}
				if(worldObj.getBlock(x + 1, y - 1, z - 1) == Blocks.air) {
					worldObj.setBlock(x + 1, y - 1, z - 1, Blocks.fire);
				}
			}
		}
    }
}