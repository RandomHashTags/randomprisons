package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Jackpot extends RPFeature {
    private static Jackpot instance;
    public static Jackpot getJackpot() {
        if(instance == null) instance = new Jackpot();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
