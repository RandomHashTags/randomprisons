package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class InventoryPets extends RPFeature {
    private static InventoryPets instance;
    public static InventoryPets getInventoryPets() {
        if(instance == null) instance = new InventoryPets();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Inventory Pets &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }

    @EventHandler
    private void playerInteractEvent(PlayerInteractEvent event) {
    }
}
