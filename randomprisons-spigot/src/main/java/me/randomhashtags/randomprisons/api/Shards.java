package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Shards extends RPFeature {
    private static Shards instance;
    public static Shards getShards() {
        if(instance == null) instance = new Shards();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }

    @EventHandler
    private void playerInteractEvent(PlayerInteractEvent event) {
    }
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    private void inventoryClickEvent(InventoryClickEvent event) {
    }
}
