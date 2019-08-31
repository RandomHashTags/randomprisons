package me.randomhashtags.randomprisons.utils.listeners;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class GivedpItem extends RPFeature implements CommandExecutor {
    private static GivedpItem instance;
    public static GivedpItem getGivedpItem() {
        if(instance == null) instance = new GivedpItem();
        return instance;
    }

    private HashMap<String, ItemStack> items, customitems;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        items = new HashMap<>();
        customitems = new HashMap<>();
    }
    public void unload() {
    }



    /*
        Player data updaters
     */
    @EventHandler
    private void playerJoinEvent(PlayerJoinEvent event) {
    }
    @EventHandler
    private void playerQuitEvent(PlayerQuitEvent event) {
    }
}
