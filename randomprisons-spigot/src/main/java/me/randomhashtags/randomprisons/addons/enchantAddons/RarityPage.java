package me.randomhashtags.randomprisons.addons.enchantAddons;

import me.randomhashtags.randomprisons.addons.EnchantRarity;
import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.util.List;

public abstract class RarityPage extends Itemable {
    public abstract List<EnchantRarity> getAppliesToRarities();
}
