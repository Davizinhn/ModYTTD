
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yttdmod.block.TorsoBlock;
import net.mcreator.yttdmod.block.Teste3Block;
import net.mcreator.yttdmod.block.PortaVidroBlock;
import net.mcreator.yttdmod.block.Pernaesquerda2Block;
import net.mcreator.yttdmod.block.Pernaesquerda1Block;
import net.mcreator.yttdmod.block.CodigoBlock;
import net.mcreator.yttdmod.block.CaixaBlock;
import net.mcreator.yttdmod.block.CabecavamoversevaiBlock;
import net.mcreator.yttdmod.block.BraconseiBlock;
import net.mcreator.yttdmod.block.Bracoesquerdo1Block;
import net.mcreator.yttdmod.block.Bracodireito2Block;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YttdModMod.MODID);
	public static final RegistryObject<Block> CAIXA = REGISTRY.register("caixa", () -> new CaixaBlock());
	public static final RegistryObject<Block> CODIGO = REGISTRY.register("codigo", () -> new CodigoBlock());
	public static final RegistryObject<Block> PORTA_VIDRO = REGISTRY.register("porta_vidro", () -> new PortaVidroBlock());
	public static final RegistryObject<Block> BRACOESQUERDO_1 = REGISTRY.register("bracoesquerdo_1", () -> new Bracoesquerdo1Block());
	public static final RegistryObject<Block> PERNAESQUERDA_1 = REGISTRY.register("pernaesquerda_1", () -> new Pernaesquerda1Block());
	public static final RegistryObject<Block> BRACODIREITO_2 = REGISTRY.register("bracodireito_2", () -> new Bracodireito2Block());
	public static final RegistryObject<Block> PERNAESQUERDA_2 = REGISTRY.register("pernaesquerda_2", () -> new Pernaesquerda2Block());
	public static final RegistryObject<Block> CABECAVAMOVERSEVAI = REGISTRY.register("cabecavamoversevai", () -> new CabecavamoversevaiBlock());
	public static final RegistryObject<Block> TORSO = REGISTRY.register("torso", () -> new TorsoBlock());
	public static final RegistryObject<Block> TESTE_3 = REGISTRY.register("teste_3", () -> new Teste3Block());
	public static final RegistryObject<Block> BRACONSEI = REGISTRY.register("braconsei", () -> new BraconseiBlock());
}
