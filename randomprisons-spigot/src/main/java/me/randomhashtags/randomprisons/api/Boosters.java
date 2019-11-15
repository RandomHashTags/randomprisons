package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.configuration.file.YamlConfiguration;

public class Boosters extends RPFeature {
    private static Boosters instance;
    public static Boosters getBoosters() {
        if(instance == null) instance = new Boosters();
        return instance;
    }

    private YamlConfiguration config;

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Boosters &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
