package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class XPBottles extends RPFeature {
    private static XPBottles instance;
    public static XPBottles getXPBottles() {
        if(instance == null) instance = new XPBottles();
        return instance;
    }

    public void load() {
    }
    public void unload() {
        instance = null;
    }
}
