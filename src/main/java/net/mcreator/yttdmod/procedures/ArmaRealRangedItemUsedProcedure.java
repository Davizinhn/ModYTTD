package net.mcreator.yttdmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.mcreator.yttdmod.network.YttdModModVariables;

public class ArmaRealRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("BalaReal") < 1)) {
			itemstack.getOrCreateTag().putDouble("BalaReal", 0);
		}
		YttdModModVariables.MapVariables.get(world).balas = 0;
		YttdModModVariables.MapVariables.get(world).syncData(world);
	}
}
