package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class EnergyForge extends RPFeature {
    private static EnergyForge instance;
    public static EnergyForge getEnergyForge() {
        if(instance == null) instance = new EnergyForge();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
