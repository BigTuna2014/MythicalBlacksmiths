package com.paul.MythicalBlacksmith.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.paul.MythicalBlacksmith.init.EntityPercyThrowable;
 
public class EntityFlameThrower extends EntityPercyThrowable
{
    private static final String __OBFID = "CL_00001722";
 
    public EntityFlameThrower(World world)
    {
        super(world);
    }
 
    public EntityFlameThrower(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }
 
    public EntityFlameThrower(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }
    protected void onImpact(MovingObjectPosition object)
    {
        if (!this.worldObj.isRemote)
        {
            if (object.entityHit != null)
            {
                if (!object.entityHit.isImmuneToFire() && object.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(getThrower(), getThrower()), ticksExisted));
                {
                	object.entityHit.setFire(5);
                }
            }
            else
            {
                int i = object.blockX;
                int j = object.blockY;
                int k = object.blockZ;
 
                switch (object.sideHit)
                {
                    case 0:
                        --j;
                        break;
                    case 1:
                        ++j;
                        break;
                    case 2:
                        --k;
                        break;
                    case 3:
                        ++k;
                        break;
                    case 4:
                        --i;
                        break;
                    case 5:
                        ++i;
                }
 
                if (this.worldObj.isAirBlock(i, j, k))
                {
                   
                        this.worldObj.setBlock(i, j, k, Blocks.fire);
                }
            }
 
            this.setDead();
        }
    }
   
    public void onUpdate()
    {
        super.onUpdate();
        this.worldObj.spawnParticle("flame", this.posX, this.posY - 0.125D, this.posZ, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("flame", this.posX, this.posY - 0.125D, this.posZ, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("flame", this.posX, this.posY - 0.125D, this.posZ, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("flame", this.posX, this.posY - 0.125D, this.posZ, this.motionX, this.motionY, this.motionZ);
 
    }
}