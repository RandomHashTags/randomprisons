package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;

public class EnergyForge extends RPFeature {
    private static EnergyForge instance;
    public static EnergyForge getEnergyForge() {
        if(instance == null) instance = new EnergyForge();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Energy Forge &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
