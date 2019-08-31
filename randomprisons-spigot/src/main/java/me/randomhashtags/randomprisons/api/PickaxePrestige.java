package me.randomhashtags.randomprisons.api;

import me.randomhashtags.randomprisons.utils.RPFeature;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

public class PickaxePrestige extends RPFeature {
    private static PickaxePrestige instance;
    public static PickaxePrestige getPickaxePrestige() {
        if(instance == null) instance = new PickaxePrestige();
        return instance;
    }

    public YamlConfiguration config;
    private ItemStack prestigeToken;

    public void load() {
        final long started = System.currentTimeMillis();
        prestigeToken = d(config, "items.prestige token");
        sendConsoleMessage("&6[RandomPrisons] &aLoaded Pickaxe Prestige &e(took " + (System.currentTimeMillis()-started) + "ms)");
    }
    public void unload() {
    }
}
