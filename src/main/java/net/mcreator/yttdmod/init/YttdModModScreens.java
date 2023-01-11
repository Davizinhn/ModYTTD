
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.yttdmod.client.gui.VersocartaScreen;
import net.mcreator.yttdmod.client.gui.VCSacrificioScreen;
import net.mcreator.yttdmod.client.gui.VCCommonerScreen;
import net.mcreator.yttdmod.client.gui.VCChavemestreguiScreen;
import net.mcreator.yttdmod.client.gui.Teste5guiScreen;
import net.mcreator.yttdmod.client.gui.LixaguiScreen;
import net.mcreator.yttdmod.client.gui.CodigoguiScreen;
import net.mcreator.yttdmod.client.gui.CartaguiScreen;
import net.mcreator.yttdmod.client.gui.CartaSacrificioguiScreen;
import net.mcreator.yttdmod.client.gui.CaixaguiScreen;
import net.mcreator.yttdmod.client.gui.CCommonerguiScreen;
import net.mcreator.yttdmod.client.gui.CChavemestreguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YttdModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(YttdModModMenus.CAIXAGUI.get(), CaixaguiScreen::new);
			MenuScreens.register(YttdModModMenus.CODIGOGUI.get(), CodigoguiScreen::new);
			MenuScreens.register(YttdModModMenus.CARTAGUI.get(), CartaguiScreen::new);
			MenuScreens.register(YttdModModMenus.VERSOCARTA.get(), VersocartaScreen::new);
			MenuScreens.register(YttdModModMenus.CARTA_SACRIFICIOGUI.get(), CartaSacrificioguiScreen::new);
			MenuScreens.register(YttdModModMenus.VC_SACRIFICIO.get(), VCSacrificioScreen::new);
			MenuScreens.register(YttdModModMenus.VC_COMMONER.get(), VCCommonerScreen::new);
			MenuScreens.register(YttdModModMenus.C_COMMONERGUI.get(), CCommonerguiScreen::new);
			MenuScreens.register(YttdModModMenus.VC_CHAVEMESTREGUI.get(), VCChavemestreguiScreen::new);
			MenuScreens.register(YttdModModMenus.C_CHAVEMESTREGUI.get(), CChavemestreguiScreen::new);
			MenuScreens.register(YttdModModMenus.LIXAGUI.get(), LixaguiScreen::new);
			MenuScreens.register(YttdModModMenus.TESTE_5GUI.get(), Teste5guiScreen::new);
		});
	}
}
