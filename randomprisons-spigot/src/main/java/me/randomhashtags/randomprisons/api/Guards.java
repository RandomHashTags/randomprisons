package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Guards extends RPFeature {
    private static Guards instance;
    public static Guards getGuards() {
        if(instance == null) instance = new Guards();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
