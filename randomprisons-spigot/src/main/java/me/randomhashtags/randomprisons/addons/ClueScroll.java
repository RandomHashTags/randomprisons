package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;
import org.bukkit.inventory.ItemStack;

public interface ClueScroll extends Itemable, RequiredMiningLevel {
    ItemStack getUndiscovered();
}
