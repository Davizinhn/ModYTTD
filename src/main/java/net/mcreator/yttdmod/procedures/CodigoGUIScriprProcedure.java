package net.mcreator.yttdmod.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class CodigoGUIScriprProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:Numero") ? ((EditBox) guistate.get("text:Numero")).getValue() : "").equals("1234")) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("O c\u00F3digo est\u00E1 certo!"), false);
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("O c\u00F3digo est\u00E1 errado!"), false);
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
