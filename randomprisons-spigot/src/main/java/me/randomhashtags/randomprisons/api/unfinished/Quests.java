package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Quests extends RPFeature {
    private static Quests instance;
    public static Quests getQuests() {
        if(instance == null) instance = new Quests();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
