package me.randomhashtags.randomprisons.api.enchantAddons;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class RandomizationScrolls extends RPFeature {
    private static RandomizationScrolls instance;
    public static RandomizationScrolls getRandomizationScrolls() {
        if(instance == null) instance = new RandomizationScrolls();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
