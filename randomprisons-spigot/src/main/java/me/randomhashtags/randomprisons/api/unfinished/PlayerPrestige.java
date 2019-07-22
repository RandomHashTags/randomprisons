package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class PlayerPrestige extends RPFeature {
    private static PlayerPrestige instance;
    public static PlayerPrestige getPlayerPrestige() {
        if(instance == null) instance = new PlayerPrestige();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
