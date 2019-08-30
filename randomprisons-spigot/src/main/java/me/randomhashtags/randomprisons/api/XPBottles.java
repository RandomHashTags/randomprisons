package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class XPBottles extends RPFeature {
    private static XPBottles instance;
    public static XPBottles getXPBottles() {
        if(instance == null) instance = new XPBottles();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    private void playerItemConsumeEvent(PlayerItemConsumeEvent event) {
    }
}
