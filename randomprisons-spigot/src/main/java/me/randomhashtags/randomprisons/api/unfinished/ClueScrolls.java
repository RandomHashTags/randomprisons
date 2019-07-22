package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class ClueScrolls extends RPFeature {
    private static ClueScrolls instance;
    public static ClueScrolls getClueScrolls() {
        if(instance == null) instance = new ClueScrolls();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
