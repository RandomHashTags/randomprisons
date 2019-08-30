package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RestedXP extends RPFeature {
    private static RestedXP instance;
    public static RestedXP getRestedXP() {
        if(instance == null) instance = new RestedXP();
        return instance;
    }

    public void load() {
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
