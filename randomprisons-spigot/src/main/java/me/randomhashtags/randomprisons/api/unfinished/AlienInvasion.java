package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.configuration.file.YamlConfiguration;

public class AlienInvasion extends RPFeature {
    private static AlienInvasion instance;
    public static AlienInvasion getAlienInvasion() {
        if(instance == null) instance = new AlienInvasion();
        return instance;
    }

    private YamlConfiguration config;

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Alien Invasion &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
