package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Outposts extends RPFeature {
    private static Outposts instance;
    public static Outposts getOutposts() {
        if(instance == null) instance = new Outposts();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
