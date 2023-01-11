package net.mcreator.yttdmod.procedures;

import net.minecraft.world.item.ItemStack;

public class ArmaRealRangedItemUsedProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("BalaReal") < 1)) {
			itemstack.getOrCreateTag().putDouble("BalaReal", 0);
		}
	}
}
