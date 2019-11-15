package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.util.RPFeature;

public class KitsGlobal extends RPFeature {
    private static KitsGlobal instance;
    public static KitsGlobal getKitsGlobal() {
        if(instance == null) instance = new KitsGlobal();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Global Kits &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
