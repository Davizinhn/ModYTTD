
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.yttdmod.world.inventory.CodigoguiMenu;
import net.mcreator.yttdmod.world.inventory.CaixaguiMenu;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, YttdModMod.MODID);
	public static final RegistryObject<MenuType<CaixaguiMenu>> CAIXAGUI = REGISTRY.register("caixagui",
			() -> IForgeMenuType.create(CaixaguiMenu::new));
	public static final RegistryObject<MenuType<CodigoguiMenu>> CODIGOGUI = REGISTRY.register("codigogui",
			() -> IForgeMenuType.create(CodigoguiMenu::new));
}
