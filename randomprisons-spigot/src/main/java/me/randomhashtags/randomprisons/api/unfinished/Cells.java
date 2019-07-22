package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Cells extends RPFeature {
    private static Cells instance;
    public static Cells getCells() {
        if(instance == null) instance = new Cells();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
