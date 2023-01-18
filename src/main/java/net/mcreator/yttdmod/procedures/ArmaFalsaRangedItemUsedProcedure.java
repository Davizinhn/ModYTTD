package net.mcreator.yttdmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.mcreator.yttdmod.network.YttdModModVariables;

public class ArmaFalsaRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("BalaFalsa") < 1)) {
			itemstack.getOrCreateTag().putDouble("BalaFalsa", 0);
		}
		YttdModModVariables.MapVariables.get(world).balasfake = 0;
		YttdModModVariables.MapVariables.get(world).syncData(world);
	}
}
