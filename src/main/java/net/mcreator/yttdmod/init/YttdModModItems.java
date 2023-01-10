
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

import net.mcreator.yttdmod.item.TorsoitemItem;
import net.mcreator.yttdmod.item.PernadireitaItemItem;
import net.mcreator.yttdmod.item.PernaEsquerdaItemItem;
import net.mcreator.yttdmod.item.LixaItem;
import net.mcreator.yttdmod.item.DardoItem;
import net.mcreator.yttdmod.item.ChaveItem;
import net.mcreator.yttdmod.item.Chave2Item;
import net.mcreator.yttdmod.item.CartaSacrificioItem;
import net.mcreator.yttdmod.item.CartaItem;
import net.mcreator.yttdmod.item.CartaCommonerItem;
import net.mcreator.yttdmod.item.CartaChavemestreItem;
import net.mcreator.yttdmod.item.CabecaItemItem;
import net.mcreator.yttdmod.item.BracoesquerdoItem;
import net.mcreator.yttdmod.item.BracodireitoItem;
import net.mcreator.yttdmod.item.ArmatesteItem;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YttdModMod.MODID);
	public static final RegistryObject<Item> CAIXA = block(YttdModModBlocks.CAIXA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CODIGO = block(YttdModModBlocks.CODIGO, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CHAVE = REGISTRY.register("chave", () -> new ChaveItem());
	public static final RegistryObject<Item> PORTA_VIDRO = doubleBlock(YttdModModBlocks.PORTA_VIDRO, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARDO = REGISTRY.register("dardo", () -> new DardoItem());
	public static final RegistryObject<Item> CARTA = REGISTRY.register("carta", () -> new CartaItem());
	public static final RegistryObject<Item> CARTA_SACRIFICIO = REGISTRY.register("carta_sacrificio", () -> new CartaSacrificioItem());
	public static final RegistryObject<Item> CARTA_COMMONER = REGISTRY.register("carta_commoner", () -> new CartaCommonerItem());
	public static final RegistryObject<Item> CARTA_CHAVEMESTRE = REGISTRY.register("carta_chavemestre", () -> new CartaChavemestreItem());
	public static final RegistryObject<Item> CHAVE_2 = REGISTRY.register("chave_2", () -> new Chave2Item());
	public static final RegistryObject<Item> LIXA = REGISTRY.register("lixa", () -> new LixaItem());
	public static final RegistryObject<Item> ARMATESTE = REGISTRY.register("armateste", () -> new ArmatesteItem());
	public static final RegistryObject<Item> TESTE_5 = block(YttdModModBlocks.TESTE_5, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TORSOITEM = REGISTRY.register("torsoitem", () -> new TorsoitemItem());
	public static final RegistryObject<Item> PERNA_ESQUERDA_ITEM = REGISTRY.register("perna_esquerda_item", () -> new PernaEsquerdaItemItem());
	public static final RegistryObject<Item> PERNADIREITA_ITEM = REGISTRY.register("pernadireita_item", () -> new PernadireitaItemItem());
	public static final RegistryObject<Item> CABECA_ITEM = REGISTRY.register("cabeca_item", () -> new CabecaItemItem());
	public static final RegistryObject<Item> BRACODIREITO = REGISTRY.register("bracodireito", () -> new BracodireitoItem());
	public static final RegistryObject<Item> BRACOESQUERDO = REGISTRY.register("bracoesquerdo", () -> new BracoesquerdoItem());
	public static final RegistryObject<Item> NAGUENTOMAIS = block(YttdModModBlocks.NAGUENTOMAIS, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
