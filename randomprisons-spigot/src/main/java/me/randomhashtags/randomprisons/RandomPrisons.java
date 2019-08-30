package me.randomhashtags.randomprisons;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomPrisons extends JavaPlugin {
    public static RandomPrisons getPlugin;

    public static Plugin spawnerPlugin;
    public static String spawner;

    public void onEnable() {
        enable();
    }

    public void onDisable() {
        disable();
    }

    public void reload() {
        enable();
        disable();
    }
    public void enable() {
        getPlugin = this;
        saveDefaultConfig();
    }
    public void disable() {
    }
}
