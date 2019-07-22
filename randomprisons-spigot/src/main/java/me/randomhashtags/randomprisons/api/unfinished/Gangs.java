package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Gangs extends RPFeature {
    private static Gangs instance;
    public static Gangs getGangs() {
        if(instance == null) instance = new Gangs();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
