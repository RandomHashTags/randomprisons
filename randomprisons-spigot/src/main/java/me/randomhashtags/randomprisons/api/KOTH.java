package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class KOTH extends RPFeature implements CommandExecutor {
    private static KOTH instance;
    public static KOTH getKOTH() {
        if(instance == null) instance = new KOTH();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded King of the Hill &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
