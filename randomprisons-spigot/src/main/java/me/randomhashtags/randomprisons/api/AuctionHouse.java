package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class AuctionHouse extends RPFeature implements CommandExecutor {
    private static AuctionHouse instance;
    public static AuctionHouse geAuctionHouse() {
        if(instance == null) instance = new AuctionHouse();
        return instance;
    }

    private YamlConfiguration config;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }

    public void load() {
        final long started = System.currentTimeMillis();
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Auction House &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
