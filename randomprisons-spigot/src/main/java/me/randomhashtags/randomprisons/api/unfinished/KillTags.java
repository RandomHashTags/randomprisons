package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class KillTags extends RPFeature {
    private static KillTags instance;
    public static KillTags getKillTags() {
        if(instance == null) instance = new KillTags();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
