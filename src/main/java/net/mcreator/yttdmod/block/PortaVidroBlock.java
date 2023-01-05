
package net.mcreator.yttdmod.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class PortaVidroBlock extends DoorBlock

{

	public PortaVidroBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRAVEL).strength(-1, 3600000).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false).dynamicShape());

	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		if (state.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) != DoubleBlockHalf.LOWER)
			return Collections.emptyList();

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
