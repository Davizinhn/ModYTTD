package net.mcreator.yttdmod.procedures;

import net.minecraft.world.item.ItemStack;

public class ArmaFalsaCanUseRangedItemProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("BalaFalsa") > 0;
	}
}
