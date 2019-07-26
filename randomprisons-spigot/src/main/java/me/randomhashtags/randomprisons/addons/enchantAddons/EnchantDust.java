package me.randomhashtags.randomprisons.addons.enchantAddons;

import me.randomhashtags.randomprisons.addons.EnchantRarity;
import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.util.List;

public abstract class EnchantDust extends Itemable {
    public abstract int getMaxPercent();
    public abstract int getMinPercent();
    public abstract List<EnchantRarity> getAppliesToRarities();
}
