package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class KitsRank extends RPFeature {
    private static KitsRank instance;
    public static KitsRank getKitsRank() {
        if(instance == null) instance = new KitsRank();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
