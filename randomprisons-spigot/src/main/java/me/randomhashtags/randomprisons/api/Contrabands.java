package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class Contrabands extends RPFeature {
    private static Contrabands instance;
    public static Contrabands getContrabands() {
        if(instance == null) instance = new Contrabands();
        return instance;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Contrabands &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }

    @EventHandler
    private void playerInteractEvent(PlayerInteractEvent event) {
    }
}
