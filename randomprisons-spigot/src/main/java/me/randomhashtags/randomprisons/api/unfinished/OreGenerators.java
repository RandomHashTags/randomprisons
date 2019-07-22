package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class OreGenerators extends RPFeature {
    private static OreGenerators instance;
    public static OreGenerators getOreGenerators() {
        if(instance == null) instance = new OreGenerators();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
