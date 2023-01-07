
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.yttdmod.block.entity.CodigoBlockEntity;
import net.mcreator.yttdmod.block.entity.CaixaBlockEntity;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, YttdModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAIXA = register("caixa", YttdModModBlocks.CAIXA, CaixaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CODIGO = register("codigo", YttdModModBlocks.CODIGO, CodigoBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
