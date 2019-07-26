package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class Pets extends RPFeature {
    private static Pets instance;
    public static Pets getPets() {
        if(instance == null) instance = new Pets();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }

    @EventHandler
    private void playerInteractEvent(PlayerInteractEvent event) {
    }
}
