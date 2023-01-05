package net.mcreator.yttdmod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class CodigoGUIScriprProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:Numero") ? ((EditBox) guistate.get("text:Numero")).getValue() : "").equals("1234")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("O c\u00F3digo est\u00E1 certo!"), (true));
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("O c\u00F3digo est\u00E1 errado!"), (true));
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
