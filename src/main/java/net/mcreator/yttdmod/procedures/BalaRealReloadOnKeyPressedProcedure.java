package net.mcreator.yttdmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BalaRealReloadOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YttdModModItems.ARMA_REAL.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("BalaReal") < 1) {
				if (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(YttdModModItems.BALA_REAL.get()))
						: false) {
					for (int index0 = 0; index0 < (int) (1); index0++) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("BalaReal") < 1) {
							if (entity instanceof Player _playerHasItem
									? _playerHasItem.getInventory().contains(new ItemStack(YttdModModItems.BALA_REAL.get()))
									: false) {
								YttdModModVariables.MapVariables.get(world).balas = 1;
								YttdModModVariables.MapVariables.get(world).syncData(world);
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(YttdModModItems.BALA_REAL.get());
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
