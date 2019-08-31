package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class CoinFlip extends RPFeature implements CommandExecutor {
    private static CoinFlip instance;
    public static CoinFlip getCoinFlip() {
        if(instance == null) instance = new CoinFlip();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Coin Flip &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
