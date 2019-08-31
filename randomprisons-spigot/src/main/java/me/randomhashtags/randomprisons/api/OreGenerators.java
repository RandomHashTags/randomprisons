package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class OreGenerators extends RPFeature {
    private static OreGenerators instance;
    public static OreGenerators getOreGenerators() {
        if(instance == null) instance = new OreGenerators();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Ore Generators &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
