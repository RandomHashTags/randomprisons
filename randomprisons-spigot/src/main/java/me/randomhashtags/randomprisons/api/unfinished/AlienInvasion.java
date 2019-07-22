package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class AlienInvasion extends RPFeature {
    private static AlienInvasion instance;
    public static AlienInvasion getAlienInvasion() {
        if(instance == null) instance = new AlienInvasion();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
