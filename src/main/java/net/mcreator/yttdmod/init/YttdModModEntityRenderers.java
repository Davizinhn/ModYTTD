
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yttdmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YttdModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(YttdModModEntities.DARDO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(YttdModModEntities.ARMA_REAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(YttdModModEntities.ARMA_FALSA.get(), ThrownItemRenderer::new);
	}
}
