package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class BankBlock extends RPFeature implements CommandExecutor {
    private static BankBlock instance;
    public static BankBlock getBankBlock() {
        if(instance == null) instance = new BankBlock();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Bank Block &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
