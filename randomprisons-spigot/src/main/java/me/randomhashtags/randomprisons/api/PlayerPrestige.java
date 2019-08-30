package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PlayerPrestige extends RPFeature implements CommandExecutor {
    private static PlayerPrestige instance;
    public static PlayerPrestige getPlayerPrestige() {
        if(instance == null) instance = new PlayerPrestige();
        return instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
    }
    public void unload() {
    }
}
