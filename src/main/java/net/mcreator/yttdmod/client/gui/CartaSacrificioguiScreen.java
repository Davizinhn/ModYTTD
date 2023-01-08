
package net.mcreator.yttdmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.yttdmod.world.inventory.CartaSacrificioguiMenu;
import net.mcreator.yttdmod.network.CartaSacrificioguiButtonMessage;
import net.mcreator.yttdmod.YttdModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CartaSacrificioguiScreen extends AbstractContainerScreen<CartaSacrificioguiMenu> {
	private final static HashMap<String, Object> guistate = CartaSacrificioguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CartaSacrificioguiScreen(CartaSacrificioguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 130;
		this.imageHeight = 170;
	}

	private static final ResourceLocation texture = new ResourceLocation("yttd_mod:textures/screens/carta_sacrificiogui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("yttd_mod:textures/screens/sacrifice.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 130, 170, 130, 170);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 90, this.topPos + 140, 30, 20, Component.literal("->"), e -> {
			if (true) {
				YttdModMod.PACKET_HANDLER.sendToServer(new CartaSacrificioguiButtonMessage(0, x, y, z));
				CartaSacrificioguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
