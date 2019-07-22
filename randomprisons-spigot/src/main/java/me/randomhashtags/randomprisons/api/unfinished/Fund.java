package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Fund extends RPFeature {
    private static Fund instance;
    public static Fund getFund() {
        if(instance == null) instance = new Fund();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
