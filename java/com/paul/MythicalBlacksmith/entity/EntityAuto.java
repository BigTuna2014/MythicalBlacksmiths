package com.paul.MythicalBlacksmith.entity;

import com.paul.MythicalBlacksmith.MainClass;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityAuto extends EntityMob {

	public EntityAuto(World world) {
		super(world);
		this.setSize(0.6F, 1.8F);
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setCanSwim(false);
		this.getNavigator().setEnterDoors(true);
		this.getNavigator().setAvoidSun(false);
		this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIMoveIndoors(this));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(5, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(25);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.3D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75.0D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(100.0D);
	}
	
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
	 
	 int l = this.rand.nextInt(11);
	 int k = this.rand.nextInt(51);
	 int m = this.rand.nextInt(6);
	 int j = this.rand.nextInt(11);
	 
	 if ( 9 < l)
        {
            this.dropItem(MainClass.AutomotonLeg, 1);
        }
	 if (49 < k)
     {
         this.dropItem(MainClass.AutomotonHead, 1);
     }
	 if (4 < m)
     {
         this.dropItem(MainClass.AutomotonChest, 1);
     }
		 if(9 < j)
	 {
         this.dropItem(MainClass.AutomotonArm, 1);
     }
    }
		

	@Override
	protected boolean isAIEnabled()
	 {
	 return true;
	 }
		
	protected String getHurtSound()
    {
        return "mob.irongolem.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.irongolem.death";
    }

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.irongolem.walk", 1.0F, 1.0F);
    }

	
}