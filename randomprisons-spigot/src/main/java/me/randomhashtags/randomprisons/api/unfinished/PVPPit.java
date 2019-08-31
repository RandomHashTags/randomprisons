package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class PVPPit extends RPFeature implements CommandExecutor {
    private static PVPPit instance;
    public static PVPPit getPVPPit() {
        if(instance == null) instance = new PVPPit();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded PvP Pit &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
