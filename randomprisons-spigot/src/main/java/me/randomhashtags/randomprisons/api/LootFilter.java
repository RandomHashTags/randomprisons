package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class LootFilter extends RPFeature implements CommandExecutor {
    private static LootFilter instance;
    public static LootFilter getLootFilter() {
        if(instance == null) instance = new LootFilter();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Loot Filter &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
