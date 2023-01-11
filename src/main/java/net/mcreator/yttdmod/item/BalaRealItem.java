
package net.mcreator.yttdmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BalaRealItem extends Item {
	public BalaRealItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).rarity(Rarity.COMMON));
	}
}
