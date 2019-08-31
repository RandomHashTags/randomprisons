package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class MonthlyCrates extends RPFeature implements CommandExecutor {
    private static MonthlyCrates instance;
    public static MonthlyCrates getMonthlyCrates() {
        if(instance == null) instance = new MonthlyCrates();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Monthly Crates &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
