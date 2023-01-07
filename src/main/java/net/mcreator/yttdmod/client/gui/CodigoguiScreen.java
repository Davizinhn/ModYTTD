
package net.mcreator.yttdmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.yttdmod.world.inventory.CodigoguiMenu;
import net.mcreator.yttdmod.network.CodigoguiButtonMessage;
import net.mcreator.yttdmod.YttdModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CodigoguiScreen extends AbstractContainerScreen<CodigoguiMenu> {
	private final static HashMap<String, Object> guistate = CodigoguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Numero;

	public CodigoguiScreen(CodigoguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 64;
	}

	private static final ResourceLocation texture = new ResourceLocation("yttd_mod:textures/screens/codigogui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		Numero.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Numero.isFocused())
			return Numero.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Numero.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "C\u00F3digo Num\u00E9rico:", 44, 7, -12829636);
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
		Numero = new EditBox(this.font, this.leftPos + 26, this.topPos + 18, 120, 20, Component.literal("1234")) {
			{
				setSuggestion("1234");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("1234");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("1234");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:Numero", Numero);
		Numero.setMaxLength(32767);
		this.addWidget(this.Numero);
		this.addRenderableWidget(new Button(this.leftPos + 67, this.topPos + 38, 35, 20, Component.literal("OK"), e -> {
			if (true) {
				YttdModMod.PACKET_HANDLER.sendToServer(new CodigoguiButtonMessage(0, x, y, z));
				CodigoguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
