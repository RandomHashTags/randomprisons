package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class PlayerAttributes extends RPFeature {
    private static PlayerAttributes instance;
    public static PlayerAttributes getPlayerAttributes() {
        if(instance == null) instance = new PlayerAttributes();
        return instance;
    }


    public void load() {
    }
    public void unload() {
    }
}
