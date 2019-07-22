package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Satchels extends RPFeature {
    private static Satchels instance;
    public static Satchels getSatchels() {
        if(instance == null) instance = new Satchels();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
