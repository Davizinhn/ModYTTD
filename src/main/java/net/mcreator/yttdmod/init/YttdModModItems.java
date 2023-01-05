
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yttdmod.item.ChaveItem;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YttdModMod.MODID);
	public static final RegistryObject<Item> CAIXA = block(YttdModModBlocks.CAIXA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CODIGO = block(YttdModModBlocks.CODIGO, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CHAVE = REGISTRY.register("chave", () -> new ChaveItem());
	public static final RegistryObject<Item> CABECARIZO = block(YttdModModBlocks.CABECARIZO, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
