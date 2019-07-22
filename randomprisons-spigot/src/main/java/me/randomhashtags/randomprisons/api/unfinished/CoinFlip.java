package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class CoinFlip extends RPFeature {
    private static CoinFlip instance;
    public static CoinFlip getCoinFlip() {
        if(instance == null) instance = new CoinFlip();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
