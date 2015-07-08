package com.paul.MythicalBlacksmith.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fluids.Fluid;

import com.paul.MythicalBlacksmith.MainClass;
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
import com.paul.MythicalBlacksmith.fluids.MBNaphtha;
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
import com.paul.MythicalBlacksmith.items.KokiriEmeraldClass;
import com.paul.MythicalBlacksmith.items.LeftMasterBladeHiltClass;
import com.paul.MythicalBlacksmith.items.MBNaphthaBucket;
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

public class Definer {

	public static void addFluidDefinitions(){
		
    	MainClass.NaphthaFluid = new Fluid("naphtha").setViscosity(7000).setDensity(7000);

	}
	
	public static void addBlockDefinitions(){
		
    	MainClass.NaphthaBlock = new MBNaphtha().setBlockName("naphtha");

	}
	
	public static void addItemDefinitions(){

    	MainClass.NaphthaBucket = new MBNaphthaBucket(MainClass.NaphthaBlock).setTextureName(MainClass.MODID + ":nbucket");

    	
	}
	
}