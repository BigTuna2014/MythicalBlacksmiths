package com.paul.MythicalBlacksmith.entity;

import com.paul.MythicalBlacksmith.MainClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMinotaur extends EntityMob{
	
	private int attackTimer;

	public EntityMinotaur(World world) {
		super(world);
		this.setSize(1.4F, 2.9F);
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
	}
	
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(3000.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(3.5D);
	        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(100.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(100.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(30.0D);
	    }
	 
	 protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
	    {
		 
		 int j = this.rand.nextInt(20);
		 int l = this.rand.nextInt(10);
		 
		 for (int i = 0; i < l; ++i)
	        {
	            this.dropItem(Items.leather, 1);
	        }
		 
		 for (int i = 0; i < j; ++i)
	        {
	            this.dropItem(Items.beef, 1);
	        }
		 
	        for (int i = 0; i < 1; ++i)
	        {
	            this.dropItem(MainClass.BattleAxe, 1);
	        }
	    }
	 
	 protected void addRandomArmor()
	    {
	        this.setCurrentItemOrArmor(0, new ItemStack(MainClass.BattleAxe));
	    }
	 
	 protected String getLivingSound()
	    {
		 	return "mob.wolf.growl";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	    	return "mob.enderdragon.growl";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	    	return "mob.enderdragon.growl";
	    }
	    
	    public void onLivingUpdate()
	    {
	        super.onLivingUpdate();

	        if (this.attackTimer > 0)
	        {
	            --this.attackTimer;
	        }

	        if (this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7D && this.rand.nextInt(5) == 0)
	        {
	            int i = MathHelper.floor_double(this.posX);
	            int j = MathHelper.floor_double(this.posY - 0.20000000298023224D - (double)this.yOffset);
	            int k = MathHelper.floor_double(this.posZ);
	            Block block = this.worldObj.getBlock(i, j, k);

	            if (block.getMaterial() != Material.air)
	            {
	                this.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(block) + "_" + this.worldObj.getBlockMetadata(i, j, k), this.posX + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, this.boundingBox.minY + 0.1D, this.posZ + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, 4.0D * ((double)this.rand.nextFloat() - 0.5D), 0.5D, ((double)this.rand.nextFloat() - 0.5D) * 4.0D);
	            }
	        }
	    }
	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        this.attackTimer = 10;
	        this.worldObj.setEntityState(this, (byte)4);
	        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

	        if (flag)
	        {
	            p_70652_1_.motionY += 0.4000000059604645D;
	        }

	        this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
	        return flag;
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public int getAttackTimer()
	    {
	        return this.attackTimer;
	    }
	    
}
