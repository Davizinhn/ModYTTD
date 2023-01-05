
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.yttdmod.client.gui.CodigoguiScreen;
import net.mcreator.yttdmod.client.gui.CaixaguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YttdModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(YttdModModMenus.CAIXAGUI.get(), CaixaguiScreen::new);
			MenuScreens.register(YttdModModMenus.CODIGOGUI.get(), CodigoguiScreen::new);
		});
	}
}
