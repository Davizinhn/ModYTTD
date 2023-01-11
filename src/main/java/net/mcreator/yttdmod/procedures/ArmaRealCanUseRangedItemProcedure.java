package net.mcreator.yttdmod.procedures;

import net.minecraft.world.item.ItemStack;

public class ArmaRealCanUseRangedItemProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("BalaReal") > 0;
	}
}
