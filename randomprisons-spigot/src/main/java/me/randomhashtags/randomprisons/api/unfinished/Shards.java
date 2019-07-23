package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Shards extends RPFeature {
    private static Shards instance;
    public static Shards getShards() {
        if(instance == null) instance = new Shards();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
