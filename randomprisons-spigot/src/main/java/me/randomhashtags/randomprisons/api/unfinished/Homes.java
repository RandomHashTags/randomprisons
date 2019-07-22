package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Homes extends RPFeature {
    private static Homes instance;
    public static Homes getHomes() {
        if(instance == null) instance = new Homes();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
