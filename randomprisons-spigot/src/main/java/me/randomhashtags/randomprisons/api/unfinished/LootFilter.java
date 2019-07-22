package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class LootFilter extends RPFeature {
    private static LootFilter instance;
    public static LootFilter getLootFilter() {
        if(instance == null) instance = new LootFilter();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
