package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;

public class Satchels extends RPFeature {
    private static Satchels instance;
    public static Satchels getSatchels() {
        if(instance == null) instance = new Satchels();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Satchels &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
