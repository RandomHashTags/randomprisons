package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class MrGovernment extends RPFeature {
    private static MrGovernment instance;
    public static MrGovernment getMrMovernment() {
        if(instance == null) instance = new MrGovernment();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
