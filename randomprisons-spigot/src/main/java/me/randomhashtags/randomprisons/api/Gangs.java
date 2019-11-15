package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class Gangs extends RPFeature implements CommandExecutor {
    private static Gangs instance;
    public static Gangs getGangs() {
        if(instance == null) instance = new Gangs();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Gangs &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
