package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.util.RPFeature;

public class KitsRank extends RPFeature {
    private static KitsRank instance;
    public static KitsRank getKitsRank() {
        if(instance == null) instance = new KitsRank();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Rank Kits &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
