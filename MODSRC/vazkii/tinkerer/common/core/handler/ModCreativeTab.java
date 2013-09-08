/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 * 
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 4.
 * Thaumcraft 4 (c) Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 * 
 * File Created @ [8 Sep 2013, 15:48:07 (GMT)]
 */
package vazkii.tinkerer.common.core.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thaumcraft.common.config.Config;
import thaumcraft.common.config.ConfigItems;
import vazkii.tinkerer.common.item.ModItems;
import vazkii.tinkerer.common.lib.LibMisc;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModCreativeTab extends CreativeTabs {

	public static final ModCreativeTab INSTANCE = new ModCreativeTab();

	public ModCreativeTab() {
		super(LibMisc.MOD_ID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ConfigItems.itemGoggles; // TODO
	}
	
}
