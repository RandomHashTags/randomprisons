package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class RarityPages extends RPFeature {
    private static RarityPages instance;
    public static RarityPages getRarityPages() {
        if(instance == null) instance = new RarityPages();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
