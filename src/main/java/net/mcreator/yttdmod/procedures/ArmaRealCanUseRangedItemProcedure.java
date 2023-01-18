package net.mcreator.yttdmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.yttdmod.network.YttdModModVariables;

public class ArmaRealCanUseRangedItemProcedure {
	public static boolean execute(LevelAccessor world) {
		return YttdModModVariables.MapVariables.get(world).balas == 1;
	}
}
