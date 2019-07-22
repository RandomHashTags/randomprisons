package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Trade extends RPFeature {
    private static Trade instance;
    public static Trade getTrade() {
        if(instance == null) instance = new Trade();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
