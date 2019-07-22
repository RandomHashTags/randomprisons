package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class PickaxePrestige extends RPFeature {
    private static PickaxePrestige instance;
    public static PickaxePrestige getPickaxePrestige() {
        if(instance == null) instance = new PickaxePrestige();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
