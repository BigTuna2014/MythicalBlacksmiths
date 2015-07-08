package com.paul.MythicalBlacksmith;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;

import com.paul.MythicalBlacksmith.CreativeTabs.MythicalBlacksmiths;
import com.paul.MythicalBlacksmith.TileEntity.TileEntitySHFurnace;
import com.paul.MythicalBlacksmith.armor.GemArmor;
import com.paul.MythicalBlacksmith.armor.HermesArmor;
import com.paul.MythicalBlacksmith.armor.InvisibilityArmor;
import com.paul.MythicalBlacksmith.armor.MythrilArmor;
import com.paul.MythicalBlacksmith.armor.OrichalcumArmor;
import com.paul.MythicalBlacksmith.biome.features.MBLeaf;
import com.paul.MythicalBlacksmith.biome.features.MBLog;
import com.paul.MythicalBlacksmith.biome.features.MBSapling;
import com.paul.MythicalBlacksmith.block.AmethystBlockClass;
import com.paul.MythicalBlacksmith.block.AmethystOreClass;
import com.paul.MythicalBlacksmith.block.LowerAutoClass;
import com.paul.MythicalBlacksmith.block.MythrilBlockClass;
import com.paul.MythicalBlacksmith.block.MythrilOreClas;
import com.paul.MythicalBlacksmith.block.OliveWoodClass;
import com.paul.MythicalBlacksmith.block.OpalBlockClass;
import com.paul.MythicalBlacksmith.block.OpalOreClass;
import com.paul.MythicalBlacksmith.block.OrichalcumBlockClass;
import com.paul.MythicalBlacksmith.block.OrichalcumOreClass;
import com.paul.MythicalBlacksmith.block.RubyBlockClass;
import com.paul.MythicalBlacksmith.block.RubyOreClass;
import com.paul.MythicalBlacksmith.block.SHFurnace;
import com.paul.MythicalBlacksmith.block.SapphireBlockClass;
import com.paul.MythicalBlacksmith.block.SapphireOreClass;
import com.paul.MythicalBlacksmith.block.SilverOreClass;
import com.paul.MythicalBlacksmith.block.TopazBlockClass;
import com.paul.MythicalBlacksmith.block.TopazOreClass;
import com.paul.MythicalBlacksmith.block.UpperAutoClass;
import com.paul.MythicalBlacksmith.entity.EntityApollosArrow;
import com.paul.MythicalBlacksmith.entity.EntityArtemisArrow;
import com.paul.MythicalBlacksmith.handler.ArmorHandler;
import com.paul.MythicalBlacksmith.handler.BucketHandler;
import com.paul.MythicalBlacksmith.handler.EntityHandler;
import com.paul.MythicalBlacksmith.handler.GuiHandler;
import com.paul.MythicalBlacksmith.init.Definer;
import com.paul.MythicalBlacksmith.init.Register;
import com.paul.MythicalBlacksmith.items.AmethystClass;
import com.paul.MythicalBlacksmith.items.AutomotonArmClass;
import com.paul.MythicalBlacksmith.items.AutomotonChestClass;
import com.paul.MythicalBlacksmith.items.AutomotonHeadClass;
import com.paul.MythicalBlacksmith.items.AutomotonLegClass;
import com.paul.MythicalBlacksmith.items.ByzantineGrenadeClass;
import com.paul.MythicalBlacksmith.items.CrystalThreadClass;
import com.paul.MythicalBlacksmith.items.EnderStickClass;
import com.paul.MythicalBlacksmith.items.FlamethrowerBagClass;
import com.paul.MythicalBlacksmith.items.FlamethrowerNozzleClass;
import com.paul.MythicalBlacksmith.items.FlamethrowerPipeClass;
import com.paul.MythicalBlacksmith.items.FlamethrowerPumpClass;
import com.paul.MythicalBlacksmith.items.GoldThreadClass;
import com.paul.MythicalBlacksmith.items.GoronRubyClass;
import com.paul.MythicalBlacksmith.items.HeatedMasterBladeClass;
import com.paul.MythicalBlacksmith.items.ItemLeafBlocks;
import com.paul.MythicalBlacksmith.items.ItemLogBlocks;
import com.paul.MythicalBlacksmith.items.ItemSaplingBlocks;
import com.paul.MythicalBlacksmith.items.KokiriEmeraldClass;
import com.paul.MythicalBlacksmith.items.LeftMasterBladeHiltClass;
import com.paul.MythicalBlacksmith.items.MasterBladeClass;
import com.paul.MythicalBlacksmith.items.MasterGemClass;
import com.paul.MythicalBlacksmith.items.MasterMetalClass;
import com.paul.MythicalBlacksmith.items.MiddleMasterBladeHiltClass;
import com.paul.MythicalBlacksmith.items.MythrilIngotClass;
import com.paul.MythicalBlacksmith.items.OpalClass;
import com.paul.MythicalBlacksmith.items.OrichalcumIngotClass;
import com.paul.MythicalBlacksmith.items.OrichalcumRodClass;
import com.paul.MythicalBlacksmith.items.RightMasterBladeHiltClass;
import com.paul.MythicalBlacksmith.items.RubyClass;
import com.paul.MythicalBlacksmith.items.SapphireClass;
import com.paul.MythicalBlacksmith.items.SilverIngotClass;
import com.paul.MythicalBlacksmith.items.SteelClass;
import com.paul.MythicalBlacksmith.items.TopazClass;
import com.paul.MythicalBlacksmith.items.UltimiteIngotClass;
import com.paul.MythicalBlacksmith.items.UltimiteRodClass;
import com.paul.MythicalBlacksmith.items.ZoraSapphireClass;
import com.paul.MythicalBlacksmith.items.tabpicClass;
import com.paul.MythicalBlacksmith.throwables.ApollosArrowClass;
import com.paul.MythicalBlacksmith.throwables.ByzantineFlamethrowerClass;
import com.paul.MythicalBlacksmith.tools.ApollosBowClass;
import com.paul.MythicalBlacksmith.tools.ArtemisBowClass;
import com.paul.MythicalBlacksmith.tools.BattleAxeClass;
import com.paul.MythicalBlacksmith.tools.DeltoraSwordClass;
import com.paul.MythicalBlacksmith.tools.DormantBladeClass;
import com.paul.MythicalBlacksmith.tools.MasterSwordClass;
import com.paul.MythicalBlacksmith.tools.MythrilAxeClass;
import com.paul.MythicalBlacksmith.tools.MythrilHoeClass;
import com.paul.MythicalBlacksmith.tools.MythrilPickaxeClass;
import com.paul.MythicalBlacksmith.tools.MythrilShovelClass;
import com.paul.MythicalBlacksmith.tools.MythrilSwordClass;
import com.paul.MythicalBlacksmith.tools.OrichalcumAxeClass;
import com.paul.MythicalBlacksmith.tools.OrichalcumHoeClass;
import com.paul.MythicalBlacksmith.tools.OrichalcumPickaxeClass;
import com.paul.MythicalBlacksmith.tools.OrichalcumShovelClass;
import com.paul.MythicalBlacksmith.tools.OrichalcumSwordClass;
import com.paul.MythicalBlacksmith.world.gen.MainGenerationClass;
import com.paul.MythicalBlacksmith.world.gen.biome.BiomesMB;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MainClass.MODID, name = MainClass.NAME, version = MainClass.VERSION)
public class MainClass {
	
	// Mod Info
	public static final String MODID = "MythicalBlacksmith"; // Used for mod registration and textures
	public static final String NAME = "Mythical Blacksmith";
	public static final String VERSION = "v1.0";
	
	
	@SidedProxy(clientSide = "com.paul.MythicalBlacksmith.ClientProxy", serverSide = "com.paul.MythicalBlacksmith.CommonProxy")
	public static ClientProxy proxy;
	public static CommonProxy cproxy;



	

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		GameRegistry.registerTileEntity(TileEntitySHFurnace.class, "SHFurnace");
	}
	
	@Instance(MainClass.MODID)
	public static MainClass instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		

		MinecraftForge.EVENT_BUS.register(new ArmorHandler());
		
		BiomesMB.init();
		
		EntityHandler.mainRegistry();
    	
		Definer.addFluidDefinitions();
		
    	Register.addFluidRegistrations();
    	
    	Definer.addBlockDefinitions();
    	
    	Definer.addItemDefinitions();
    	
    	BucketHandler.INSTANCE.buckets.put(NaphthaBlock, NaphthaBucket);

    	Register.addBlockRegistrations();
    	
    	Register.addItemRegistrations();
    	
    	Register.addEventRegistrations();
    	
    	
		// Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(OrichalcumHelmet, 1), new Object[] { "xxx", "x x", 'x', OrichalcumIngot });
		GameRegistry.addRecipe(new ItemStack(OrichalcumChestplate, 1), new Object[] { "x x", "xxx", "xxx", 'x', OrichalcumIngot });
		GameRegistry.addRecipe(new ItemStack(OrichalcumLeggings, 1), new Object[] { "xxx", "x x", "x x", 'x', OrichalcumIngot });
		GameRegistry.addRecipe(new ItemStack(OrichalcumBoots, 1), new Object[] { "x x", "x x", 'x', OrichalcumIngot });
		GameRegistry.addRecipe(new ItemStack(OrichalcumSword, 1), new Object[] { " x ", " x ", " y ", 'x', OrichalcumIngot, 'y', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(OrichalcumShovel, 1), new Object[] { " x ", " y ", " y ", 'x', OrichalcumIngot, 'y', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(OrichalcumAxe, 1), new Object[] { "xx ", "xy ", " y ", 'x', OrichalcumIngot, 'y', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(OrichalcumHoe, 1), new Object[] { "xx ", " y ", " y ", 'x', OrichalcumIngot, 'y', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(OrichalcumPickaxe, 1), new Object[] { "xxx", " y ", " y ", 'x', OrichalcumIngot, 'y', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(MythrilHelmet, 1), new Object[] {"xxx", "x x", 'x', MythrilIngot });
		GameRegistry.addRecipe(new ItemStack(MythrilChestplate, 1), new Object[] {"x x", "xxx", "xxx", 'x', MythrilIngot });
		GameRegistry.addRecipe(new ItemStack(MythrilLeggings, 1), new Object[] {"xxx", "x x", "x x", 'x', MythrilIngot });
		GameRegistry.addRecipe(new ItemStack(MythrilBoots, 1), new Object[] {"x x", "x x", 'x', MythrilIngot });
		GameRegistry.addRecipe(new ItemStack(MythrilSword, 1), new Object[] {" x ", " x ", " y ", 'x', MythrilIngot, 'y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(MythrilShovel, 1), new Object[] {" x ", " y ", " y ", 'x', MythrilIngot, 'y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(MythrilAxe, 1), new Object[] {"xx ", "xy ", " y ", 'x', MythrilIngot, 'y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(MythrilHoe, 1), new Object[] {"xx ", " y ", " y ", 'x', MythrilIngot, 'y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(MythrilPickaxe, 1), new Object[] {"xxx", " y ", " y ", 'x', MythrilIngot, 'y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(MasterBlade, 1), new Object[] {" x ", " y ", 'x', HeatedMasterBlade, 'y', Items.water_bucket });
		GameRegistry.addRecipe(new ItemStack(GoldThread, 3), new Object[] { " xy", "xyx", "yx ", 'x', Items.gold_nugget, 'y', Items.string });
		GameRegistry.addRecipe(new ItemStack(CrystalThread, 3), new Object[] {" xy", "xyx", "yx ", 'x', new ItemStack(Items.dye, 1, 4), 'y', Items.string });
		GameRegistry.addRecipe(new ItemStack(EnderStick, 2), new Object[] {" x ", " x ", 'x', Items.ender_eye });
		GameRegistry.addRecipe(new ItemStack(MasterGem, 1), new Object[] { " x ", "xyx", " x ", 'x', Items.diamond, 'y', Items.nether_star });
		GameRegistry.addRecipe(new ItemStack(MasterMetal, 1), new Object[] {" xy", "xyx", "yx ", 'x', OrichalcumRod, 'y', UltimiteRod });
		GameRegistry.addRecipe(new ItemStack(DormantBlade, 1), new Object[] {"  x", " zy ", "mr ", 'x', MasterBlade, 'z', LeftMasterBladeHilt, 'y', MasterGem, 'm', MiddleMasterBladeHilt, 'r', RightMasterBladeHilt });
		GameRegistry.addRecipe(new ItemStack(MiddleMasterBladeHilt, 1), new Object[] { " yy", "zxz", "yy ", 'x', OrichalcumRod, 'y', new ItemStack(Items.dye, 2, 5), 'z', new ItemStack(Items.dye, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(LeftMasterBladeHilt, 1), new Object[] { "xy ", "xx ", 'x', OrichalcumIngot, 'y', new ItemStack(Items.dye, 2, 5), });
		GameRegistry.addRecipe(new ItemStack(RightMasterBladeHilt, 1), new Object[] { " xy", " yy", 'x', new ItemStack(Items.dye, 2, 5), 'y', OrichalcumIngot });
		GameRegistry.addRecipe(new ItemStack(KokiriEmerald, 1), new Object[] { " xx", "xy ", " x ", 'x', Items.gold_nugget, 'y', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(GoronRuby, 1), new Object[] {"xyx", " x ", 'x', Items.gold_nugget, 'y', Ruby });
		GameRegistry.addRecipe(new ItemStack(ZoraSapphire, 1), new Object[] {"xyx", "yxy", 'x', Items.gold_nugget, 'y', Sapphire });
		GameRegistry.addRecipe(new ItemStack(Steel, 1), new Object[] { "xyx","yxy", "xyx", 'x', Items.iron_ingot, 'y', Items.coal });
		GameRegistry.addRecipe(new ItemStack(UltimiteIngot, 2), new Object[] {"xyx", "yzy", "xyx", 'x', MythrilIngot, 'y', OrichalcumIngot,'z', Items.ender_eye });
		GameRegistry.addRecipe(new ItemStack(UltimiteRod, 1), new Object[] {" x ", " x ", 'x', UltimiteIngot });
		GameRegistry.addRecipe(new ItemStack(OrichalcumRod, 3), new Object[] {" x ", " x ", 'x', OrichalcumIngot });
		GameRegistry.addRecipe(new ItemStack(SHFurnaceIdle, 1), new Object[] {"xyx", "yky", "xzx", 'x', Blocks.iron_block, 'y', Blocks.obsidian, 'k', Blocks.furnace, 'z', Blocks.gold_block });
		GameRegistry.addRecipe(new ItemStack(DeltoraSword, 1), new Object[] {"lto", "egr", "dsa", 'l', new ItemStack(Items.dye, 1, 4), 't', Topaz, 'o', Opal, 'e', Items.emerald, 'g', Items.golden_sword, 'r', Ruby, 'd', Items.diamond, 's', Steel, 'a', Amethyst});
		GameRegistry.addRecipe(new ItemStack(ApollosBow, 1), new Object[] {" sg", "s g", " sg", 's', Items.blaze_rod, 'g', GoldThread});
		GameRegistry.addRecipe(new ItemStack(ArtemisBow, 1), new Object[] {" sg", "s g", " sg", 's', EnderStick, 'g', CrystalThread});
		GameRegistry.addRecipe(new ItemStack(ApollosArrow, 3), new Object[] {" g ", " e ", " f ", 'g', Items.gold_nugget, 'e', EnderStick, 'f', Items.feather});
		GameRegistry.addRecipe(new ItemStack(ApollosArrow, 3), new Object[] {" g ", " e ", " f ", 'g', Items.gold_nugget, 'e', Items.blaze_rod, 'f', Items.feather});
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table), new Object[] {"##", "##", '#', OliveWood});
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object[] {"#", "#", '#', OliveWood});
		GameRegistry.addRecipe(new ItemStack(Blocks.fence, 2), new Object[] {"wsw", "wsw", 'w', blockLog, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TopazLeggings, 1), new Object[] {"ttt", "tlt", "ttt", 't', Topaz, 'l', Items.golden_leggings});
		GameRegistry.addRecipe(new ItemStack(AmethystBoots, 1), new Object[] {"aaa", "aba", "aaa", 'a', Amethyst, 'b', Items.golden_boots});
		GameRegistry.addRecipe(new ItemStack(OpalChestplate, 1), new Object[] {"ooo", "oco", "ooo", 'o', Opal, 'c', Items.golden_chestplate});
		GameRegistry.addRecipe(new ItemStack(SapphireHelmet, 1), new Object[] {"sss", "shs", "sss", 's', Sapphire, 'h', Items.golden_helmet});
		GameRegistry.addRecipe(new ItemStack(UpperAuto, 1), new Object[] {" h ", "ata", 'h' , AutomotonHead,'a', AutomotonArm, 't', AutomotonChest});
		GameRegistry.addRecipe(new ItemStack(LowerAuto, 1), new Object[] {"l l", 'l', AutomotonLeg});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_axe, 1), new Object[] {"ww", "ws", " s", 'w', OliveWood, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_door, 1), new Object[] {"ww", "ww", "ww", 'w', OliveWood});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe, 1), new Object[] {"ww ", " s ", " s ", 'w', OliveWood, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe, 1), new Object[] {"www", " s ", " s ", 's', Items.stick, 'w', OliveWood});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel, 1), new Object[] {"w", "s", "s", 'w', OliveWood, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_sword, 1), new Object[] {"w", "w", "s", 'w', OliveWood, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.chest, 1), new Object[] {"www", "w w", "www", 'w', OliveWood});
		GameRegistry.addRecipe(new ItemStack(Blocks.fence_gate, 2), new Object[] {"sws", "sws", 'w', OliveWood, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HermesBoots, 1), new Object[] {"frf", "fbf", "frf", 'f', Items.feather, 'r', Ruby, 'b', OrichalcumBoots});
		GameRegistry.addRecipe(new ItemStack(InvisibilityCloak, 1), new Object[] {"sss", "shs", "sss", 's', Steel, 'h', OrichalcumHelmet});
		GameRegistry.addRecipe(new ItemStack(ByzantineFlamethrower, 1), new Object[] {"bpn", " t ", 'b', FlamethrowerBag, 'p', FlamethrowerPipe, 'n', FlamethrowerNozzle, 't', FlamethrowerPump});
		GameRegistry.addRecipe(new ItemStack(FlamethrowerBag, 1), new Object[] {"lll", "lbl", "lll", 'l', Items.leather, 'b', Items.bucket});
		GameRegistry.addRecipe(new ItemStack(FlamethrowerPipe, 1), new Object[] {"sss", "   ", "sss", 's', Steel});
		GameRegistry.addRecipe(new ItemStack(FlamethrowerNozzle, 1), new Object[] {"s  ", "d t", "sss", 's', Steel, 'd', Blocks.dispenser, 't', Blocks.torch});
		GameRegistry.addRecipe(new ItemStack(FlamethrowerPump, 1), new Object [] {"sss", "p b", 's', Steel, 'p', Blocks.piston, 'b', Blocks.stone_button});
		GameRegistry.addRecipe(new ItemStack(ByzantineGrenade, 3), new Object [] {"bbb", "bsb", "bbb", 'b', Items.brick, 's', NaphthaBucket});
		
		// Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(MasterSword, 1), new Object[] { KokiriEmerald, DormantBlade, GoronRuby, ZoraSapphire });
		GameRegistry.addShapelessRecipe(new ItemStack(foodOlive, 1), new Object[] {blockLeaf});
		GameRegistry.addShapelessRecipe(new ItemStack(OliveWood, 4), new Object[] {blockLog});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 1), new Object[]{OliveWood});
		
		// Smelting Recipes
		GameRegistry.addSmelting(RubyOre, new ItemStack(Ruby), 2.50F);
		
		
    	
	}
	
	public static void addEventRegistrations(){
		MainClass m = new MainClass();

    	MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		
    }
	
	@EventHandler
	public static void load(FMLInitializationEvent event) {
		
		proxy.registerNetworkStuff();
		//Arrow Render
		
		EntityRegistry.registerGlobalEntityID(EntityApollosArrow.class, "garrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityArtemisArrow.class, "artearrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityApollosArrow.class, "aparrow", 1, MainClass.MODID, 128, 1, true);
		EntityRegistry.registerModEntity(EntityArtemisArrow.class, "ararrow", 2, MainClass.MODID, 128, 1, true);
		proxy.registerRenderThing();
		proxy.registerSounds();
	}
	
	// Armor ID's
	public static int orichalcumHelmetID;
	public static int orichalcumChestplateID;
	public static int orichalcumLeggingsID;
	public static int orichalcumBootsID;

	public static int mythrilHelmetID;
	public static int mythrilChestplateID;
	public static int mythrilLeggingsID;
	public static int mythrilBootsID;
	
	public static int hermesBootsID;
	
	public static int amethystBootsID;
	public static int topazLeggingsID;
	public static int sapphireHelmetID;
	public static int opalChestplateID;
	
	public static int invisibilityCloakID;
	
	public static Item NaphthaBucket;
	
	public static Block NaphthaBlock;
	
	public static Fluid NaphthaFluid;
	
	public static Material NaphthaMaterial;
	
	public static final int naphthaID = 4051;
	
	// Creative Tabs
	public static CreativeTabs MythicalBlacksmiths = new MythicalBlacksmiths(CreativeTabs.getNextID(), "smiths");

	// Materials
	public static ToolMaterial OrichalcumMaterial = EnumHelper.addToolMaterial("OrichalcumMaterial", 3, 3122, 16.0F, 6.0F, 20);
	public static ToolMaterial MythrilMaterial = EnumHelper.addToolMaterial("MythrilMaterial", 2, 262, 32.0F, 6.0F, 50);
	public static ToolMaterial MasterMaterial = EnumHelper.addToolMaterial("MasterMaterial", 3, -1, 50.0F, 36.0F, 50);
	public static ToolMaterial DormantMaterial = EnumHelper.addToolMaterial("DormantMaterial", 2, -1, 6.0F, 2.0F, 14);
	public static ToolMaterial DeltoraMaterial = EnumHelper.addToolMaterial("DeltoraMaterial", 3, 1561, 8.0F, 10.0F, 25);
	public static ToolMaterial BattleMaterial = EnumHelper.addToolMaterial("BattleMaterial", 3, 40000, 100.0F, 50.0F, 1);
	// public static ToolMaterial ExampleMaterial = EnumHelper.addToolMaterial("name", harvestLevel, maxUses, efficiency, damage, enchantability);
	
	// Generation
	public static MainGenerationClass MainWorldGen = new MainGenerationClass();

	// Armor Material
	public static ArmorMaterial OrichalcumArmorMaterial = EnumHelper.addArmorMaterial("OrichalcumArmorMaterial", 66, new int[] { 4, 9, 7, 4}, 20);
	public static ArmorMaterial MythrilArmorMaterial = EnumHelper.addArmorMaterial("MythrilArmorMaterial", 15, new int[] { 3, 8, 6, 3}, 25);
	public static ArmorMaterial HermesArmorMaterial = EnumHelper.addArmorMaterial("HermesArmorMaterial", -1, new int[] {1, 3, 2, 1}, 0);
	public static ArmorMaterial GemArmorMaterial = EnumHelper.addArmorMaterial("GemArmorMaterial", 15, new int[] {2, 5, 3, 1}, 10);
	public static ArmorMaterial InvisibilityMaterial = EnumHelper.addArmorMaterial("InvisibilityMaterial", -1, new int[] {0, 0, 0, 0}, 0);
	// public static ArmorMaterial ExampleMaterial = EnumHelper.addArmorMaterial("name", durability, reductionAmounts, enchantability);

	// Blocks
	public static Block AmethystOre = new AmethystOreClass(Material.rock).setBlockName("aore").setCreativeTab(MythicalBlacksmiths);
	public static Block TopazOre = new TopazOreClass(Material.rock).setBlockName("tore").setCreativeTab(MythicalBlacksmiths);
	public static Block OrichalcumOre = new OrichalcumOreClass(Material.rock).setBlockName("oreo").setCreativeTab(MythicalBlacksmiths);
	public static Block RubyOre = new RubyOreClass(Material.rock).setBlockName("rore").setCreativeTab(MythicalBlacksmiths);
	public static Block OpalOre = new OpalOreClass(Material.rock).setBlockName("opore").setCreativeTab(MythicalBlacksmiths);
	public static Block SapphireOre = new SapphireOreClass(Material.rock).setBlockName("sore").setCreativeTab(MythicalBlacksmiths);
	public static Block SilverOre = new SilverOreClass(Material.rock).setBlockName("siore").setCreativeTab(MythicalBlacksmiths);
	public static Block MythrilOre = new MythrilOreClas(Material.rock).setBlockName("more").setCreativeTab(MythicalBlacksmiths);
	public static Block OrichalcumBlock = new OrichalcumBlockClass(Material.rock).setBlockName("oblock").setCreativeTab(MythicalBlacksmiths);
	public static Block AmethystBlock = new AmethystBlockClass(Material.rock).setBlockName("ablock").setCreativeTab(MythicalBlacksmiths);
	public static Block MythrilBlock = new MythrilBlockClass(Material.rock).setBlockName("mock").setCreativeTab(MythicalBlacksmiths);
	public static Block OpalBlock = new OpalBlockClass(Material.rock).setBlockName("opblock").setCreativeTab(MythicalBlacksmiths);
	public static Block RubyBlock = new RubyBlockClass(Material.rock).setBlockName("rblock").setCreativeTab(MythicalBlacksmiths);
	public static Block SapphireBlock = new SapphireBlockClass(Material.rock).setBlockName("sock").setCreativeTab(MythicalBlacksmiths);
	public static Block OliveWood = new OliveWoodClass(Material.wood).setBlockName("owood").setCreativeTab(MythicalBlacksmiths);
	public static Block UpperAuto = new UpperAutoClass(Material.iron).setBlockName("upauto").setCreativeTab(MythicalBlacksmiths);
	public static Block LowerAuto = new LowerAutoClass(Material.iron).setBlockName("loauto").setCreativeTab(MythicalBlacksmiths);
	public static Block TopazBlock = new TopazBlockClass(Material.rock).setBlockName("tblock").setCreativeTab(MythicalBlacksmiths);
	
	//Trees
	public static Block blockLog = new MBLog().setBlockName("Log").setCreativeTab(MythicalBlacksmiths);
	public static Block blockLeaf = new MBLeaf().setBlockName("Leaf").setCreativeTab(MythicalBlacksmiths);
	public static Block blockSapling = new MBSapling().setBlockName("Sapling").setCreativeTab(MythicalBlacksmiths);

	// Machines
	public static Block SHFurnaceIdle = new SHFurnace(false).setBlockName("SHFurnaceIdle").setCreativeTab(MythicalBlacksmiths).setHardness(3.5F);
	public static Block SHFurnaceActive = new SHFurnace(true).setBlockName("SHFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
	public static final int guiIDSHFurnace = 0;
	
	// Items
	public static Item OrichalcumIngot = new OrichalcumIngotClass().setUnlocalizedName("oingot").setCreativeTab(MythicalBlacksmiths);
	public static Item UltimiteIngot = new UltimiteIngotClass().setUnlocalizedName("uingot").setCreativeTab(MythicalBlacksmiths);
	public static Item MythrilIngot = new MythrilIngotClass().setUnlocalizedName("mingot").setCreativeTab(MythicalBlacksmiths);
	public static Item SilverIngot = new SilverIngotClass().setUnlocalizedName("singot").setCreativeTab(MythicalBlacksmiths);
	public static Item CrystalThread = new CrystalThreadClass().setUnlocalizedName("cthread").setCreativeTab(MythicalBlacksmiths);
	public static Item GoldThread = new GoldThreadClass().setUnlocalizedName("gthread").setCreativeTab(MythicalBlacksmiths);
	public static Item Amethyst = new AmethystClass().setUnlocalizedName("ast").setCreativeTab(MythicalBlacksmiths);
	public static Item MasterGem = new MasterGemClass().setUnlocalizedName("mgem").setCreativeTab(MythicalBlacksmiths);
	public static Item Opal = new OpalClass().setUnlocalizedName("oal").setCreativeTab(MythicalBlacksmiths);
	public static Item Ruby = new RubyClass().setUnlocalizedName("rby").setCreativeTab(MythicalBlacksmiths);
	public static Item Sapphire = new SapphireClass().setUnlocalizedName("sire").setCreativeTab(MythicalBlacksmiths);
	public static Item Topaz = new TopazClass().setUnlocalizedName("topaz").setCreativeTab(MythicalBlacksmiths);
	public static Item Steel = new SteelClass().setUnlocalizedName("steel").setCreativeTab(MythicalBlacksmiths);
	public static Item EnderStick = new EnderStickClass().setUnlocalizedName("estick").setCreativeTab(MythicalBlacksmiths);
	public static Item UltimiteRod = new UltimiteRodClass().setUnlocalizedName("urod").setCreativeTab(MythicalBlacksmiths);
	public static Item HeatedMasterBlade = new HeatedMasterBladeClass().setUnlocalizedName("hade").setCreativeTab(MythicalBlacksmiths);
	public static Item OrichalcumRod = new OrichalcumRodClass().setUnlocalizedName("orod").setCreativeTab(MythicalBlacksmiths);
	public static Item MasterBlade = new MasterBladeClass().setUnlocalizedName("made").setCreativeTab(MythicalBlacksmiths);
	public static Item MasterMetal = new MasterMetalClass().setUnlocalizedName("mmetal").setCreativeTab(MythicalBlacksmiths);
	public static Item LeftMasterBladeHilt = new LeftMasterBladeHiltClass().setUnlocalizedName("lmhilt").setCreativeTab(MythicalBlacksmiths);
	public static Item KokiriEmerald = new KokiriEmeraldClass().setUnlocalizedName("koald").setCreativeTab(MythicalBlacksmiths);
	public static Item GoronRuby = new GoronRubyClass().setUnlocalizedName("gruby").setCreativeTab(MythicalBlacksmiths);
	public static Item ZoraSapphire = new ZoraSapphireClass().setUnlocalizedName("zfire").setCreativeTab(MythicalBlacksmiths);
	public static Item RightMasterBladeHilt = new RightMasterBladeHiltClass().setUnlocalizedName("rmhilt").setCreativeTab(MythicalBlacksmiths);
	public static Item MiddleMasterBladeHilt = new MiddleMasterBladeHiltClass().setUnlocalizedName("mhilt").setCreativeTab(MythicalBlacksmiths);
	public static Item tabpic = new tabpicClass().setUnlocalizedName("tabpic");
	public static Item AutomotonLeg = new AutomotonLegClass().setUnlocalizedName("aleg").setCreativeTab(MythicalBlacksmiths);
	public static Item AutomotonArm = new AutomotonArmClass().setUnlocalizedName("aarm").setCreativeTab(MythicalBlacksmiths);
	public static Item AutomotonChest = new AutomotonChestClass().setUnlocalizedName("achest").setCreativeTab(MythicalBlacksmiths);
	public static Item AutomotonHead = new AutomotonHeadClass().setUnlocalizedName("ahead").setCreativeTab(MythicalBlacksmiths);
	
	//Flamethrower Stuff
	public static Item FlamethrowerBag = new FlamethrowerBagClass().setUnlocalizedName("fbag").setCreativeTab(MythicalBlacksmiths);
	public static Item FlamethrowerPump = new FlamethrowerPumpClass().setUnlocalizedName("fpump").setCreativeTab(MythicalBlacksmiths);
	public static Item FlamethrowerPipe = new FlamethrowerPipeClass().setUnlocalizedName("fpipe").setCreativeTab(MythicalBlacksmiths);
	public static Item FlamethrowerNozzle = new FlamethrowerNozzleClass().setUnlocalizedName("fnozzle").setCreativeTab(MythicalBlacksmiths);
	
	// Food
	public static Item foodOlive = new ItemFood(2, .3F, false).setUnlocalizedName("Olive").setCreativeTab(MythicalBlacksmiths).setTextureName(MainClass.MODID + ":Olive");
	
	// Arrows
	public static Item ApollosArrow = new ApollosArrowClass().setUnlocalizedName("aparrow").setCreativeTab(MythicalBlacksmiths).setTextureName(MainClass.MODID + ":aparrow");
	
	// Tools
	public static Item OrichalcumAxe = new OrichalcumAxeClass(OrichalcumMaterial).setUnlocalizedName("oaxe").setCreativeTab(MythicalBlacksmiths);
	public static Item OrichalcumSword = new OrichalcumSwordClass(OrichalcumMaterial).setUnlocalizedName("osword").setCreativeTab(MythicalBlacksmiths);
	public static Item OrichalcumHoe = new OrichalcumHoeClass(OrichalcumMaterial).setUnlocalizedName("ohoe").setCreativeTab(MythicalBlacksmiths);
	public static Item OrichalcumPickaxe = new OrichalcumPickaxeClass(OrichalcumMaterial).setUnlocalizedName("opick").setCreativeTab(MythicalBlacksmiths);
	public static Item OrichalcumShovel = new OrichalcumShovelClass(OrichalcumMaterial).setUnlocalizedName("oshove").setCreativeTab(MythicalBlacksmiths);

	public static Item MythrilAxe = new MythrilAxeClass(MythrilMaterial).setUnlocalizedName("maxe").setCreativeTab(MythicalBlacksmiths);
	public static Item MythrilSword = new MythrilSwordClass(MythrilMaterial).setUnlocalizedName("msword").setCreativeTab(MythicalBlacksmiths);
	public static Item MythrilHoe = new MythrilHoeClass(MythrilMaterial).setUnlocalizedName("mhoe").setCreativeTab(MythicalBlacksmiths);
	public static Item MythrilPickaxe = new MythrilPickaxeClass(MythrilMaterial).setUnlocalizedName("mpick").setCreativeTab(MythicalBlacksmiths);
	public static Item MythrilShovel = new MythrilShovelClass(MythrilMaterial).setUnlocalizedName("mshove").setCreativeTab(MythicalBlacksmiths);

	public static Item MasterSword = new MasterSwordClass(MasterMaterial).setUnlocalizedName("MasterSword").setCreativeTab(MythicalBlacksmiths);

	public static Item DormantBlade = new DormantBladeClass(DormantMaterial).setUnlocalizedName("DormantBlade").setCreativeTab(MythicalBlacksmiths);

	public static Item DeltoraSword = new DeltoraSwordClass(DeltoraMaterial).setUnlocalizedName("DeltoraSword").setCreativeTab(MythicalBlacksmiths);
	
	public static Item BattleAxe = new BattleAxeClass(BattleMaterial).setUnlocalizedName("BattleAxe").setCreativeTab(MythicalBlacksmiths);
	
	// Bows
	public static Item ApollosBow = new ApollosBowClass().setUnlocalizedName("abow").setTextureName(MainClass.MODID + ":abow").setCreativeTab(MythicalBlacksmiths);
	public static Item ArtemisBow = new ArtemisBowClass().setUnlocalizedName("arbow").setTextureName(MainClass.MODID + ":arbow").setCreativeTab(MythicalBlacksmiths);
	
	// Throwables
	public static Item ByzantineGrenade = new ByzantineGrenadeClass().setUnlocalizedName("bnade").setTextureName(MainClass.MODID + ":bnade").setCreativeTab(MythicalBlacksmiths);
	public static Item ByzantineFlamethrower = new ByzantineFlamethrowerClass().setUnlocalizedName("bthrower").setTextureName(MainClass.MODID + ":bthrower").setCreativeTab(MythicalBlacksmiths);
	
	// Armor
	public static Item OrichalcumHelmet = new OrichalcumArmor(OrichalcumArmorMaterial, orichalcumHelmetID, 0).setUnlocalizedName("OrichalcumHelmet");
	public static Item OrichalcumChestplate = new OrichalcumArmor(OrichalcumArmorMaterial, orichalcumChestplateID, 1).setUnlocalizedName("OrichalcumChestplate");
	public static Item OrichalcumLeggings = new OrichalcumArmor(OrichalcumArmorMaterial, orichalcumLeggingsID, 2).setUnlocalizedName("OrichalcumLeggings");
	public static Item OrichalcumBoots = new OrichalcumArmor(OrichalcumArmorMaterial, orichalcumBootsID, 3).setUnlocalizedName("OrichalcumBoots");

	public static Item MythrilHelmet = new MythrilArmor(MythrilArmorMaterial, mythrilHelmetID, 0).setUnlocalizedName("MythrilHelmet");
	public static Item MythrilChestplate = new MythrilArmor(MythrilArmorMaterial, mythrilChestplateID, 1).setUnlocalizedName("MythrilChestplate");
	public static Item MythrilLeggings = new MythrilArmor(MythrilArmorMaterial, mythrilLeggingsID, 2).setUnlocalizedName("MythrilLeggings");
	public static Item MythrilBoots = new MythrilArmor(MythrilArmorMaterial, mythrilBootsID, 3).setUnlocalizedName("MythrilBoots");
	
	public static Item HermesBoots = new HermesArmor(HermesArmorMaterial, hermesBootsID, 3).setUnlocalizedName("HermesBoots");
	
	public static Item SapphireHelmet = new GemArmor(GemArmorMaterial, sapphireHelmetID, 0).setUnlocalizedName("SapphireHelmet");
	public static Item OpalChestplate = new GemArmor(GemArmorMaterial, opalChestplateID, 1).setUnlocalizedName("OpalChestplate");
	public static Item TopazLeggings  = new GemArmor(GemArmorMaterial, topazLeggingsID, 2).setUnlocalizedName("TopazLeggings");
	public static Item AmethystBoots = new GemArmor(GemArmorMaterial, amethystBootsID, 3).setUnlocalizedName("AmethystBoots");

	public static Item InvisibilityCloak = new InvisibilityArmor(InvisibilityMaterial, invisibilityCloakID, 0).setUnlocalizedName("InvisibilityCloak");
	
	public MainClass() {

		//Register Containers
		//FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("naphtha", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(NaphthaBucket), new ItemStack(Items.bucket));
		//Register Fluids
		
		//Register Arrows
		GameRegistry.registerItem(ApollosArrow, "Apollo's Arrow");
		
		//Register Item Entity I Think :D
		GameRegistry.registerItem(ByzantineGrenade, "Byzantine Grenade");
		GameRegistry.registerItem(ByzantineFlamethrower, "Byzantine Flamethrower");
		
		// Register Blocks
		GameRegistry.registerBlock(AmethystOre, "AmethystOre");
		GameRegistry.registerBlock(OpalOre, "Opal Ore");
		GameRegistry.registerBlock(RubyOre, "Ruby Ore");
		GameRegistry.registerBlock(OrichalcumOre, "Orichalcum Ore");
		GameRegistry.registerBlock(SapphireOre, "Sapphire Ore");
		GameRegistry.registerBlock(SilverOre, "Silver Ore");
		GameRegistry.registerBlock(TopazOre, "Topaz Ore");
		GameRegistry.registerBlock(OrichalcumBlock, "Orichalcum block");
		GameRegistry.registerBlock(MythrilBlock, "Mythril block");
		GameRegistry.registerBlock(AmethystBlock, "Amethyst Block");
		GameRegistry.registerBlock(OpalBlock, "Opal Block");
		GameRegistry.registerBlock(RubyBlock, "Ruby Block");
		GameRegistry.registerBlock(SapphireBlock, "Sapphire Block");
		GameRegistry.registerBlock(OliveWood, "Olive Wood");
		GameRegistry.registerBlock(UpperAuto, "Upper Auto");
		GameRegistry.registerBlock(LowerAuto, "Lower Auto");
		GameRegistry.registerBlock(MythrilOre, "Mythril Ore");
		GameRegistry.registerBlock(TopazBlock, "Topaz Block");
		
		// Register Tree
		GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSapling, ItemSaplingBlocks.class, blockSapling.getUnlocalizedName().substring(5));

		// Register Items
		GameRegistry.registerItem(OrichalcumIngot, "Orichalcum Ingot");
		GameRegistry.registerItem(UltimiteIngot, "Ultimite Ingot");
		GameRegistry.registerItem(MythrilIngot, "Mythril Ingot");
		GameRegistry.registerItem(SilverIngot, "Silver Ingot");
		GameRegistry.registerItem(CrystalThread, "Crystal Thread");
		GameRegistry.registerItem(GoldThread, "Gold Thread");
		GameRegistry.registerItem(Amethyst, "Amethyst");
		GameRegistry.registerItem(MasterGem, "Master Gem");
		GameRegistry.registerItem(Ruby, "Ruby");
		GameRegistry.registerItem(Opal, "Opal");
		GameRegistry.registerItem(Sapphire, "Sapphire");
		GameRegistry.registerItem(Topaz, "Topaz");
		GameRegistry.registerItem(Steel, "Steel");
		GameRegistry.registerItem(EnderStick, "Ender Stick");
		GameRegistry.registerItem(UltimiteRod, "Ultimite Rod");
		GameRegistry.registerItem(HeatedMasterBlade, "Heated Master Blade");
		GameRegistry.registerItem(OrichalcumRod, "Orichalcum Rod");
		GameRegistry.registerItem(MasterBlade, "Master Blade");
		GameRegistry.registerItem(MasterMetal, "Master Metal");
		GameRegistry.registerItem(LeftMasterBladeHilt, "Left Master Blade Hilt");
		GameRegistry.registerItem(KokiriEmerald, "Kokiri Emerald");
		GameRegistry.registerItem(GoronRuby, "Goron Ruby");
		GameRegistry.registerItem(ZoraSapphire, "Zora Sapphire");
		GameRegistry.registerItem(MiddleMasterBladeHilt, "Middle Master Blade Hilt");
		GameRegistry.registerItem(RightMasterBladeHilt, "Right Master Blade Hilt");
		GameRegistry.registerItem(tabpic, "tabpic");
		GameRegistry.registerItem(AutomotonLeg, "Automoton Leg");
		GameRegistry.registerItem(AutomotonChest, "Automoton Chest");
		GameRegistry.registerItem(AutomotonArm, "Automotn Arm");
		GameRegistry.registerItem(AutomotonHead, "Automoton Head");
		
		// Register Flamethrower Stuff
		GameRegistry.registerItem(FlamethrowerNozzle, "Flamethrower Nozzle");
		GameRegistry.registerItem(FlamethrowerPipe, "Flamethrower Pipe");
		GameRegistry.registerItem(FlamethrowerPump, "Flamethrower Pump");
		GameRegistry.registerItem(FlamethrowerBag, "Flamethrower Bag");
		
		// Register Tools
		GameRegistry.registerItem(MasterSword, "Master Sword");
		GameRegistry.registerItem(OrichalcumSword, "Orichalcum Sword");
		GameRegistry.registerItem(OrichalcumAxe, "Orichalcum Axe");
		GameRegistry.registerItem(OrichalcumHoe, "Orichalcum Hoe");
		GameRegistry.registerItem(OrichalcumPickaxe, "Orichalcum Pickaxe");
		GameRegistry.registerItem(OrichalcumShovel, "Orichalcum Shovel");
		GameRegistry.registerItem(MythrilSword, "Mythril Sword");
		GameRegistry.registerItem(MythrilAxe, "Mythril Axe");
		GameRegistry.registerItem(MythrilHoe, "Mythril Hoe");
		GameRegistry.registerItem(MythrilPickaxe, "Mythril Pickaxe");
		GameRegistry.registerItem(MythrilShovel, "Mythril Shovel");
		GameRegistry.registerItem(DormantBlade, "Dormant Blade");
		GameRegistry.registerItem(DeltoraSword, "Deltora Sword");
		GameRegistry.registerItem(ApollosBow, "Apollo's Bow");
		GameRegistry.registerItem(ArtemisBow, "Artemis Bow");
		GameRegistry.registerItem(BattleAxe, "Battle Axe");
		
		
		// Machines

		GameRegistry.registerBlock(SHFurnaceIdle, "SHFurnaceIdle");
		GameRegistry.registerBlock(SHFurnaceActive, "SHFurnaceActive");
		
		// Register Armor
		GameRegistry.registerItem(OrichalcumHelmet, "Orichalucm Helmet");
		GameRegistry.registerItem(OrichalcumChestplate, "Orichalcum Chestplate");
		GameRegistry.registerItem(OrichalcumLeggings, "Orichalcum Leggings");
		GameRegistry.registerItem(OrichalcumBoots, "Orichalcum Boots");
		GameRegistry.registerItem(MythrilHelmet, "Mythril Helmet");
		GameRegistry.registerItem(MythrilChestplate, "Mythril Chestplate");
		GameRegistry.registerItem(MythrilLeggings, "Mythril Leggings");
		GameRegistry.registerItem(MythrilBoots, "Mythril Boots");
		GameRegistry.registerItem(HermesBoots, "Hermes Boots");
		GameRegistry.registerItem(TopazLeggings, "Topaz Leggings");
		GameRegistry.registerItem(OpalChestplate, "Opal Chestplate");
		GameRegistry.registerItem(SapphireHelmet, "Sapphire Helmet");
		GameRegistry.registerItem(AmethystBoots, "Amethyst Boots");
		GameRegistry.registerItem(InvisibilityCloak, "Invisibility Cloak");
		
		//Register Food
		GameRegistry.registerItem(foodOlive, "Olive");

		// Register World Generation
		GameRegistry.registerWorldGenerator(MainWorldGen, 1);
		
		//register... Things
		proxy.registerRenderThing();
		

		
		// Brewing Recipes
		
		

	}
}