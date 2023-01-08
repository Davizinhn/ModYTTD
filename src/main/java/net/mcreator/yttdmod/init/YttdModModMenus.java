
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.yttdmod.world.inventory.VersocartaMenu;
import net.mcreator.yttdmod.world.inventory.VCSacrificioMenu;
import net.mcreator.yttdmod.world.inventory.VCCommonerMenu;
import net.mcreator.yttdmod.world.inventory.VCChavemestreguiMenu;
import net.mcreator.yttdmod.world.inventory.LixaguiMenu;
import net.mcreator.yttdmod.world.inventory.CodigoguiMenu;
import net.mcreator.yttdmod.world.inventory.CartaguiMenu;
import net.mcreator.yttdmod.world.inventory.CartaSacrificioguiMenu;
import net.mcreator.yttdmod.world.inventory.CaixaguiMenu;
import net.mcreator.yttdmod.world.inventory.CCommonerguiMenu;
import net.mcreator.yttdmod.world.inventory.CChavemestreguiMenu;
import net.mcreator.yttdmod.YttdModMod;

public class YttdModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, YttdModMod.MODID);
	public static final RegistryObject<MenuType<CaixaguiMenu>> CAIXAGUI = REGISTRY.register("caixagui",
			() -> IForgeMenuType.create(CaixaguiMenu::new));
	public static final RegistryObject<MenuType<CodigoguiMenu>> CODIGOGUI = REGISTRY.register("codigogui",
			() -> IForgeMenuType.create(CodigoguiMenu::new));
	public static final RegistryObject<MenuType<CartaguiMenu>> CARTAGUI = REGISTRY.register("cartagui",
			() -> IForgeMenuType.create(CartaguiMenu::new));
	public static final RegistryObject<MenuType<VersocartaMenu>> VERSOCARTA = REGISTRY.register("versocarta",
			() -> IForgeMenuType.create(VersocartaMenu::new));
	public static final RegistryObject<MenuType<CartaSacrificioguiMenu>> CARTA_SACRIFICIOGUI = REGISTRY.register("carta_sacrificiogui",
			() -> IForgeMenuType.create(CartaSacrificioguiMenu::new));
	public static final RegistryObject<MenuType<VCSacrificioMenu>> VC_SACRIFICIO = REGISTRY.register("vc_sacrificio",
			() -> IForgeMenuType.create(VCSacrificioMenu::new));
	public static final RegistryObject<MenuType<VCCommonerMenu>> VC_COMMONER = REGISTRY.register("vc_commoner",
			() -> IForgeMenuType.create(VCCommonerMenu::new));
	public static final RegistryObject<MenuType<CCommonerguiMenu>> C_COMMONERGUI = REGISTRY.register("c_commonergui",
			() -> IForgeMenuType.create(CCommonerguiMenu::new));
	public static final RegistryObject<MenuType<VCChavemestreguiMenu>> VC_CHAVEMESTREGUI = REGISTRY.register("vc_chavemestregui",
			() -> IForgeMenuType.create(VCChavemestreguiMenu::new));
	public static final RegistryObject<MenuType<CChavemestreguiMenu>> C_CHAVEMESTREGUI = REGISTRY.register("c_chavemestregui",
			() -> IForgeMenuType.create(CChavemestreguiMenu::new));
	public static final RegistryObject<MenuType<LixaguiMenu>> LIXAGUI = REGISTRY.register("lixagui", () -> IForgeMenuType.create(LixaguiMenu::new));
}
