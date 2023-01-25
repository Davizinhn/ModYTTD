package net.mcreator.yttdmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ArmaRealRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("BalaReal") < 1)) {
			itemstack.getOrCreateTag().putDouble("BalaReal", 0);
		}
		YttdModModVariables.MapVariables.get(world).balas = 0;
		YttdModModVariables.MapVariables.get(world).syncData(world);
	}
}
