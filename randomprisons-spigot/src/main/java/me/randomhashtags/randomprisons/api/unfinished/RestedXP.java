package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class RestedXP extends RPFeature {
    private static RestedXP instance;
    public static RestedXP getRestedXP() {
        if(instance == null) instance = new RestedXP();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
