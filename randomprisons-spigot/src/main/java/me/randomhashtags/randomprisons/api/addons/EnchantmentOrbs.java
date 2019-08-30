package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class EnchantmentOrbs extends RPFeature {
    private static EnchantmentOrbs instance;
    public static EnchantmentOrbs getEnchantmentOrbs() {
        if(instance == null) instance = new EnchantmentOrbs();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
