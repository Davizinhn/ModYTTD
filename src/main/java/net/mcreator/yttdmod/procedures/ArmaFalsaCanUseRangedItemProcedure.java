package net.mcreator.yttdmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ArmaFalsaCanUseRangedItemProcedure {
	public static boolean execute(LevelAccessor world) {
		return YttdModModVariables.MapVariables.get(world).balasfake == 1;
	}
}
