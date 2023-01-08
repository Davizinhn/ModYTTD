
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.yttdmod.YttdModMod;

public class YttdModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, YttdModMod.MODID);
	public static final RegistryObject<PaintingVariant> MIESTRE = REGISTRY.register("miestre", () -> new PaintingVariant(64, 64));
	public static final RegistryObject<PaintingVariant> ARMAESQUERDA = REGISTRY.register("armaesquerda", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> ARMADIREITA = REGISTRY.register("armadireita", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> CARAMORTOESQUERDA = REGISTRY.register("caramortoesquerda", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> CARAMORTODIREITA = REGISTRY.register("caramortodireita", () -> new PaintingVariant(16, 32));
}
