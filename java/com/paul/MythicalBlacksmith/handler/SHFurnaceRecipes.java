package com.paul.MythicalBlacksmith.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

import com.paul.MythicalBlacksmith.MainClass;

public class SHFurnaceRecipes
{
    private static final SHFurnaceRecipes smeltingBase = new SHFurnaceRecipes();
    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private static final String __OBFID = "CL_00000085";

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static SHFurnaceRecipes smelting()
    {
        return smeltingBase;
    }

    private SHFurnaceRecipes()
    {
    	this.itemRecipe(MainClass.MasterMetal, new ItemStack(MainClass.HeatedMasterBlade), 0.7F);
    	this.blockRecipe(MainClass.blockLog, new ItemStack(Items.coal, 1, 1), 0.15F);
    	this.blockRecipe(MainClass.TopazOre, new ItemStack(MainClass.Topaz), 0.7F);
    	this.blockRecipe(MainClass.SilverOre, new ItemStack(MainClass.SilverIngot), 0.7F);
    	this.blockRecipe(MainClass.SapphireOre, new ItemStack(MainClass.Sapphire), 0.7F);
    	this.blockRecipe(MainClass.RubyOre, new ItemStack(MainClass.Ruby), 1.0F);
    	this.blockRecipe(MainClass.OpalOre, new ItemStack(MainClass.Opal), 0.7F);
    	this.blockRecipe(MainClass.MythrilOre, new ItemStack(MainClass.MythrilIngot), 0.7F);
    	this.blockRecipe(MainClass.AmethystOre, new ItemStack(MainClass.Amethyst), 0.7F);
    	this.blockRecipe(MainClass.OrichalcumOre, new ItemStack(MainClass.OrichalcumIngot), 0.7F);
        this.blockRecipe(Blocks.iron_ore, new ItemStack(Items.iron_ingot), 0.7F);
        this.blockRecipe(Blocks.gold_ore, new ItemStack(Items.gold_ingot), 1.0F);
        this.blockRecipe(Blocks.diamond_ore, new ItemStack(Items.diamond), 1.0F);
        this.blockRecipe(Blocks.sand, new ItemStack(Blocks.glass), 0.1F);
        this.itemRecipe(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.35F);
        this.itemRecipe(Items.beef, new ItemStack(Items.cooked_beef), 0.35F);
        this.itemRecipe(Items.chicken, new ItemStack(Items.cooked_chicken), 0.35F);
        this.blockRecipe(Blocks.cobblestone, new ItemStack(Blocks.stone), 0.1F);
        this.itemRecipe(Items.clay_ball, new ItemStack(Items.brick), 0.3F);
        this.blockRecipe(Blocks.clay, new ItemStack(Blocks.hardened_clay), 0.35F);
        this.blockRecipe(Blocks.cactus, new ItemStack(Items.dye, 1, 2), 0.2F);
        this.blockRecipe(Blocks.log, new ItemStack(Items.coal, 1, 1), 0.15F);
        this.blockRecipe(Blocks.log2, new ItemStack(Items.coal, 1, 1), 0.15F);
        this.blockRecipe(Blocks.emerald_ore, new ItemStack(Items.emerald), 1.0F);
        this.itemRecipe(Items.potato, new ItemStack(Items.baked_potato), 0.35F);
        this.blockRecipe(Blocks.netherrack, new ItemStack(Items.netherbrick), 0.1F);
        ItemFishFood.FishType[] afishtype = ItemFishFood.FishType.values();
        int i = afishtype.length;

        for (int j = 0; j < i; ++j)
        {
            ItemFishFood.FishType fishtype = afishtype[j];

            if (fishtype.func_150973_i())
            {
                this.exp(new ItemStack(Items.fish, 1, fishtype.func_150976_a()), new ItemStack(Items.cooked_fished, 1, fishtype.func_150976_a()), 0.35F);
            }
        }

        this.blockRecipe(Blocks.coal_ore, new ItemStack(Items.coal), 0.1F);
        this.blockRecipe(Blocks.redstone_ore, new ItemStack(Items.redstone), 0.7F);
        this.blockRecipe(Blocks.lapis_ore, new ItemStack(Items.dye, 1, 4), 0.2F);
        this.blockRecipe(Blocks.quartz_ore, new ItemStack(Items.quartz), 0.2F);
    }

    public void blockRecipe(Block block, ItemStack itemstack, float f)
    {
        this.itemRecipe(Item.getItemFromBlock(block), itemstack, f);
    }

    public void itemRecipe(Item item, ItemStack itemstack, float f)
    {
        this.exp(new ItemStack(item, 1, 32767), itemstack, f);
    }

    public void exp(ItemStack itemstack, ItemStack itemstack2, float f)
    {
        this.smeltingList.put(itemstack, itemstack2);
        this.experienceList.put(itemstack2, Float.valueOf(f));
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack itemstack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(itemstack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack itemstack, ItemStack itemstack2)
    {
        return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float smeltExp(ItemStack itemstack)
    {
        float ret = itemstack.getItem().getSmeltingExperience(itemstack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(itemstack, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}