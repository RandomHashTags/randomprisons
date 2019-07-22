package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Showcase extends RPFeature {
    private static Showcase instance;
    public static Showcase getShowcase() {
        if(instance == null) instance = new Showcase();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
