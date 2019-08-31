package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.io.File;

public class KillTags extends RPFeature {
    private static KillTags instance;
    public static KillTags getKillTags() {
        if(instance == null) instance = new KillTags();
        return instance;
    }

    public YamlConfiguration config;
    private ItemStack killtag;

    public void load() {
        final long started = System.currentTimeMillis();
        save(null, "kill tags.yml");
        config = YamlConfiguration.loadConfiguration(new File(rpd, "kill tags.yml"));
        killtag = d(config, "item");
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Kill Tags &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }


    @EventHandler
    private void playerInteractEvent(PlayerInteractEvent event) {
    }
    @EventHandler
    private void entityDeathEvent(EntityDeathEvent event) {
        final LivingEntity e = event.getEntity();
        final Player killer = e.getKiller();
        if(killer != null && e instanceof Player) {
        }
    }
}
