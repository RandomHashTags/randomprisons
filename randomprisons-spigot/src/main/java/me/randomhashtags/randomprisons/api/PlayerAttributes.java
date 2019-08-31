package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class PlayerAttributes extends RPFeature implements CommandExecutor {
    private static PlayerAttributes instance;
    public static PlayerAttributes getPlayerAttributes() {
        if(instance == null) instance = new PlayerAttributes();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Player Attributes &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
