package me.randomhashtags.randomprisons.api.addons;

import me.randomhashtags.randomprisons.util.RPFeature;

public class KitsQuests extends RPFeature {
    private static KitsQuests instance;
    public static KitsQuests getKitsQuests() {
        if(instance == null) instance = new KitsQuests();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Quest Kits &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
