package net.mcreator.yttdmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yttdmod.init.YttdModModItems;

public class BalaFalsaReloadOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YttdModModItems.ARMA_FALSA.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("BalaFalsa") < 1) {
				if (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(YttdModModItems.BALA_FALSA.get()))
						: false) {
					for (int index0 = 0; index0 < (int) (1); index0++) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("BalaFalsa") < 1) {
							if (entity instanceof Player _playerHasItem
									? _playerHasItem.getInventory().contains(new ItemStack(YttdModModItems.BALA_FALSA.get()))
									: false) {
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble(
										"BalaFalsa", ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
												.getOrCreateTag().getDouble("BalaFalsa") + 0));
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(YttdModModItems.BALA_FALSA.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
											_player.inventoryMenu.getCraftSlots());
								}
							}
						}
					}
				}
			}
		}
	}
}
