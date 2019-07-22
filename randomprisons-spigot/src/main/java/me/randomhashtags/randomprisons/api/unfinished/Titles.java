package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class Titles extends RPFeature {
    private static Titles instance;
    public static Titles getTitles() {
        if(instance == null) instance = new Titles();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
