package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.util.RPFeature;

public class EnchantmentDusts extends RPFeature {
    private static EnchantmentDusts instance;
    public static EnchantmentDusts getEnchantmentDusts() {
        if(instance == null) instance = new EnchantmentDusts();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Enchantment Dusts &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
