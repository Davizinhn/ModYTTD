
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yttdmod.item.DardoItem;
import net.mcreator.yttdmod.item.ChaveItem;
import net.mcreator.yttdmod.item.CartaSacrificioItem;
import net.mcreator.yttdmod.item.CartaItem;
import net.mcreator.yttdmod.item.CartaCommonerItem;
import net.mcreator.yttdmod.item.CartaChavemestreItem;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YttdModMod.MODID);
	public static final RegistryObject<Item> CAIXA = block(YttdModModBlocks.CAIXA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CODIGO = block(YttdModModBlocks.CODIGO, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CHAVE = REGISTRY.register("chave", () -> new ChaveItem());
	public static final RegistryObject<Item> PORTA_VIDRO = doubleBlock(YttdModModBlocks.PORTA_VIDRO, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARDO = REGISTRY.register("dardo", () -> new DardoItem());
	public static final RegistryObject<Item> CABECARIZO = block(YttdModModBlocks.CABECARIZO, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CARTA = REGISTRY.register("carta", () -> new CartaItem());
	public static final RegistryObject<Item> CARTA_SACRIFICIO = REGISTRY.register("carta_sacrificio", () -> new CartaSacrificioItem());
	public static final RegistryObject<Item> CARTA_COMMONER = REGISTRY.register("carta_commoner", () -> new CartaCommonerItem());
	public static final RegistryObject<Item> CARTA_CHAVEMESTRE = REGISTRY.register("carta_chavemestre", () -> new CartaChavemestreItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
