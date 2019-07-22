package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class KOTH extends RPFeature {
    private static KOTH instance;
    public static KOTH getKOTH() {
        if(instance == null) instance = new KOTH();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
