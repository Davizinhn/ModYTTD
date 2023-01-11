
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.yttdmod.network.BalaRealReloadMessage;
import net.mcreator.yttdmod.network.BalaFalsaReloadMessage;
import net.mcreator.yttdmod.YttdModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class YttdModModKeyMappings {
	public static final KeyMapping BALA_REAL_RELOAD = new KeyMapping("key.yttd_mod.bala_real_reload", GLFW.GLFW_KEY_F, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YttdModMod.PACKET_HANDLER.sendToServer(new BalaRealReloadMessage(0, 0));
				BalaRealReloadMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BALA_FALSA_RELOAD = new KeyMapping("key.yttd_mod.bala_falsa_reload", GLFW.GLFW_KEY_F, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YttdModMod.PACKET_HANDLER.sendToServer(new BalaFalsaReloadMessage(0, 0));
				BalaFalsaReloadMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(BALA_REAL_RELOAD);
		event.register(BALA_FALSA_RELOAD);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				BALA_REAL_RELOAD.consumeClick();
				BALA_FALSA_RELOAD.consumeClick();
			}
		}
	}
}
