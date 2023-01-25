package net.mcreator.yttdmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ArmaFalsaRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("BalaFalsa") < 1)) {
			itemstack.getOrCreateTag().putDouble("BalaFalsa", 0);
		}
		YttdModModVariables.MapVariables.get(world).balasfake = 0;
		YttdModModVariables.MapVariables.get(world).syncData(world);
	}
}
