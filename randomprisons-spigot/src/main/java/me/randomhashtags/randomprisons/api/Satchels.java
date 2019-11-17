package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.Feature;
import me.randomhashtags.randomprisons.util.RPFeature;
import me.randomhashtags.randomprisons.util.RPStorage;

public class Satchels extends RPFeature {
    private static Satchels instance;
    public static Satchels getSatchels() {
        if(instance == null) instance = new Satchels();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded " + RPStorage.getAll(Feature.SATCHEL).size() + " Satchels &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
        RPStorage.unregisterAll(Feature.SATCHEL);
    }
}
