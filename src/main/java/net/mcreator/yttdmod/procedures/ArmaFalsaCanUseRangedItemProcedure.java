package net.mcreator.yttdmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.yttdmod.network.YttdModModVariables;

public class ArmaFalsaCanUseRangedItemProcedure {
	public static boolean execute(LevelAccessor world) {
		return YttdModModVariables.MapVariables.get(world).balasfake == 1;
	}
}
