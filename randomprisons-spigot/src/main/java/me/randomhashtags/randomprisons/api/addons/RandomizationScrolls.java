package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.util.RPFeature;

public class RandomizationScrolls extends RPFeature {
    private static RandomizationScrolls instance;
    public static RandomizationScrolls getRandomizationScrolls() {
        if(instance == null) instance = new RandomizationScrolls();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Randomization Scrolls &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
