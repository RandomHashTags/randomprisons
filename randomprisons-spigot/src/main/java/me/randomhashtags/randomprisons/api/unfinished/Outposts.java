package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class Outposts extends RPFeature implements CommandExecutor {
    private static Outposts instance;
    public static Outposts getOutposts() {
        if(instance == null) instance = new Outposts();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Outposts &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
