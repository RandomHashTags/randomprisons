package me.randomhashtags.randomprisons.api.unfinished;

public class KitsGlobal {
    private static KitsGlobal instance;
    public static KitsGlobal getKitsGlobal() {
        if(instance == null) instance = new KitsGlobal();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
