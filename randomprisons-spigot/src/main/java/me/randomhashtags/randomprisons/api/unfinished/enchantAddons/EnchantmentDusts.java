package me.randomhashtags.randomprisons.api.unfinished.enchantAddons;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class EnchantmentDusts extends RPFeature {
    private static EnchantmentDusts instance;
    public static EnchantmentDusts getEnchantmentDusts() {
        if(instance == null) instance = new EnchantmentDusts();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
