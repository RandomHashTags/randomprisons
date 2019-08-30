package me.randomhashtags.randomprisons.api.addons;

public class KitsQuests {
    private static KitsQuests instance;
    public static KitsQuests getKitsQuests() {
        if(instance == null) instance = new KitsQuests();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
