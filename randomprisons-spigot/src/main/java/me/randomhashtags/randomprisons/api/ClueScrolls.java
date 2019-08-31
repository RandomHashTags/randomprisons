package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class ClueScrolls extends RPFeature {
    private static ClueScrolls instance;
    public static ClueScrolls getClueScrolls() {
        if(instance == null) instance = new ClueScrolls();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Clue Scrolls &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
