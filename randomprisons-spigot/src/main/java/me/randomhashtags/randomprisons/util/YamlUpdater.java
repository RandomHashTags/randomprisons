package me.randomhashtags.randomprisons.util;

import me.randomhashtags.randomprisons.util.universal.UVersion;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.*;

public class YamlUpdater extends UVersion {
    private static YamlUpdater instance;
    public static YamlUpdater getYmlUpdater() {
        if(instance == null) instance = new YamlUpdater();
        return instance;
    }

    private boolean update(File file) {
        if(file.exists()) {
            final LinkedHashMap<String, Object> changes = getChanges(file);
            if(changes != null && !changes.isEmpty()) {
                YamlConfiguration yml = YamlConfiguration.loadConfiguration(file);
                boolean changed = false;
                final ConfigurationSection section = yml.getConfigurationSection("");
                final Set<String> keys = section.getKeys(true);
                for(String change : changes.keySet()) {
                    if(!keys.contains(change)) {
                        changed = true;
                        yml.set(change, changes.get(change));
                    }
                }
                if(changed) {
                    System.out.println("[RandomPackage] Updated file \"" + file.getName() + "\" with new contents!");
                    try {
                        yml.save(file);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
                return changed;
            }
        }
        return false;
    }
    public void update() {
        final String[] f = new String[] {
        };
        final File rpd = randomprisons.getDataFolder();
        final List<String> updatedymls = new ArrayList<>();
        for(String s : f) {
            final File y = new File(rpd, s + ".yml");
            if(y.exists()) {
                final boolean updated = update(y);
                if(updated) updatedymls.add(s + ".yml");
            }
        }
        sendConsoleMessage("&6[RandomPrisons] &a" + (!updatedymls.isEmpty() ? "Updated the following ymls: &e" + updatedymls.toString() : "All files up to date"));
    }

    public LinkedHashMap<String, Object> getChanges(File file) {
        final String n = file.getName().split("\\.yml")[0];
        switch(n) {
            case "config": return getConfig();
            default: return null;
        }
    }

    private LinkedHashMap<String, Object> putAll(Object[] values) {
        final LinkedHashMap<String, Object> tree = new LinkedHashMap<>();
        for(int i = 0; i < values.length; i++) {
            final Object o = values[i];
            if(o instanceof Object[]) {
                final Object[] obj = (Object[]) o;
                for(int z = 0; z < obj.length; z++) {
                    if(z%2 == 1) {
                        tree.put((String) obj[z-1], obj[z]);
                    }
                }
            } else if(i%2 == 1) {
                tree.put(values[i-1].toString(), o);
            }
        }
        return tree;
    }

    private LinkedHashMap<String, Object> getConfig() {
        final Object[] values = new Object[] {
        };
        return putAll(values);
    }


    private Object[] newInventory(String key, String title, int size) {
        return new Object[]{
                key + ".title", title,
                key + ".size", size
        };
    }
    private Object[] newItemStack(String key, int slot, String material, String name, List<String> lore, String picksup) {
        return new Object[]{
                key + ".slot", slot,
                key + ".item", material,
                key + ".name", name,
                key + ".lore", lore,
                key + ".picks up", picksup
        };
    }
    private List<String> newStringList(String...list) {
        return Arrays.asList(list);
    }
}