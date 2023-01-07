package net.mcreator.yttdmod.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class CodigoGUIScriprProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:Numero") ? ((EditBox) guistate.get("text:Numero")).getValue() : "").equals("1234")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("O c\u00F3digo est\u00E1 certo!"), (true));
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 15;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("O c\u00F3digo est\u00E1 errado!"), (true));
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
