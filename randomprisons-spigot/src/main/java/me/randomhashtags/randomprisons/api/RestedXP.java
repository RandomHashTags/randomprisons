package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RestedXP extends RPFeature {
    private static RestedXP instance;
    public static RestedXP getRestedXP() {
        if(instance == null) instance = new RestedXP();
        return instance;
    }

    private YamlConfiguration config;

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Rested XP &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }

    @EventHandler
    private void playerJoinEvent(PlayerJoinEvent event) {
    }
    @EventHandler
    private void playerQuitEvent(PlayerQuitEvent event) {
    }
}
