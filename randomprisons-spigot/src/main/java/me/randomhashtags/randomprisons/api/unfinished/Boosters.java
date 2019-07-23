package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Boosters extends RPFeature {
    private static Boosters instance;
    public static Boosters getBoosters() {
        if(instance == null) instance = new Boosters();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
