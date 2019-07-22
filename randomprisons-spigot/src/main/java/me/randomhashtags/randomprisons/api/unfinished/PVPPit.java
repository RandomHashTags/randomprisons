package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class PVPPit extends RPFeature {
    private static PVPPit instance;
    public static PVPPit getPVPPit() {
        if(instance == null) instance = new PVPPit();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
