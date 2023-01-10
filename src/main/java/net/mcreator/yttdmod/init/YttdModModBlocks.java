
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yttdmod.block.Teste5Block;
import net.mcreator.yttdmod.block.PortaVidroBlock;
import net.mcreator.yttdmod.block.NaguentomaisBlock;
import net.mcreator.yttdmod.block.CodigoBlock;
import net.mcreator.yttdmod.block.CaixaBlock;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YttdModMod.MODID);
	public static final RegistryObject<Block> CAIXA = REGISTRY.register("caixa", () -> new CaixaBlock());
	public static final RegistryObject<Block> CODIGO = REGISTRY.register("codigo", () -> new CodigoBlock());
	public static final RegistryObject<Block> PORTA_VIDRO = REGISTRY.register("porta_vidro", () -> new PortaVidroBlock());
	public static final RegistryObject<Block> TESTE_5 = REGISTRY.register("teste_5", () -> new Teste5Block());
	public static final RegistryObject<Block> NAGUENTOMAIS = REGISTRY.register("naguentomais", () -> new NaguentomaisBlock());
}
