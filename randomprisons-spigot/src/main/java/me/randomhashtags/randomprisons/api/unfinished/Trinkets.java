package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Trinkets extends RPFeature {
    private static Trinkets instance;
    public static Trinkets getTrinkets() {
        if(instance == null) instance = new Trinkets();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
