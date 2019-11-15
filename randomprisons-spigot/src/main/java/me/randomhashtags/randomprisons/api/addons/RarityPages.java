package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.util.RPFeature;

public class RarityPages extends RPFeature {
    private static RarityPages instance;
    public static RarityPages getRarityPages() {
        if(instance == null) instance = new RarityPages();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Rarity Pages &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
