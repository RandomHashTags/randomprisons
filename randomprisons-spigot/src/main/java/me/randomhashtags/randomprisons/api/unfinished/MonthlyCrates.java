package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class MonthlyCrates extends RPFeature {
    private static MonthlyCrates instance;
    public static MonthlyCrates getMonthlyCrates() {
        if(instance == null) instance = new MonthlyCrates();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
