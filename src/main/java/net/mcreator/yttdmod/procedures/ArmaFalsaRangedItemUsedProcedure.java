package net.mcreator.yttdmod.procedures;

import net.minecraft.world.item.ItemStack;

public class ArmaFalsaRangedItemUsedProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("BalaFalsa") < 1)) {
			itemstack.getOrCreateTag().putDouble("BalaFalsa", 0);
		}
	}
}
