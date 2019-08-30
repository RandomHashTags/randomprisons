package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Contrabands extends RPFeature {
    private static Contrabands instance;
    public static Contrabands getContrabands() {
        if(instance == null) instance = new Contrabands();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
