package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.configuration.file.YamlConfiguration;

public class Guards extends RPFeature {
    private static Guards instance;
    public static Guards getGuards() {
        if(instance == null) instance = new Guards();
        return instance;
    }

    private YamlConfiguration config;

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Guards &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
