
package net.mcreator.yttdmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.yttdmod.procedures.ArmaRealRangedItemUsedProcedure;
import net.mcreator.yttdmod.procedures.ArmaRealCanUseRangedItemProcedure;
import net.mcreator.yttdmod.entity.ArmaRealEntity;

public class ArmaRealItem extends Item {
	public ArmaRealItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (ArmaRealCanUseRangedItemProcedure.execute(world)) {
				ArmaRealEntity entityarrow = ArmaRealEntity.shoot(world, entity, world.getRandom(), 1f, 100, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				ArmaRealRangedItemUsedProcedure.execute(world, itemstack);
			}
		}
	}
}
