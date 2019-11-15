package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.util.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CustomEnchants extends RPFeature implements CommandExecutor {
    private static CustomEnchants instance;
    public static CustomEnchants getCustomEnchants() {
        if(instance == null) instance = new CustomEnchants();
        return instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Custom Enchants &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
