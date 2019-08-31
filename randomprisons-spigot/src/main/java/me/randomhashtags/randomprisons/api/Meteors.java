package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Meteors extends RPFeature {
    private static Meteors instance;
    public static Meteors getMeteors() {
        if(instance == null) instance = new Meteors();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Meteors &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
