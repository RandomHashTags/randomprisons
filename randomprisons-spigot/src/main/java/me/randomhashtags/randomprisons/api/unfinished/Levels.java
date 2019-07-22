package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Levels extends RPFeature {
    private static Levels instance;
    public static Levels getLevels() {
        if(instance == null) instance = new Levels();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
