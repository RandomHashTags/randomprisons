package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class Levels extends RPFeature implements CommandExecutor {
    private static Levels instance;
    public static Levels getLevels() {
        if(instance == null) instance = new Levels();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Levels &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
