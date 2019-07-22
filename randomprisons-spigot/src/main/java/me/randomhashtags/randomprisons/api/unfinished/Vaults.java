package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Vaults extends RPFeature {
    private static Vaults instance;
    public static Vaults getVaults() {
        if(instance == null) instance = new Vaults();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
