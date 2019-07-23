package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Warps extends RPFeature {
    private static Warps instance;
    public static Warps getWarps() {
        if(instance == null) instance = new Warps();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
