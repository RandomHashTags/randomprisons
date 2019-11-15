package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class Fund extends RPFeature implements CommandExecutor {
    private static Fund instance;
    public static Fund getFund() {
        if(instance == null) instance = new Fund();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Server Fund &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
