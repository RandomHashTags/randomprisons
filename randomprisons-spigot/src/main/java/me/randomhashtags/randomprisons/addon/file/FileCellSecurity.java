package me.randomhashtags.randomprisons.addon.file;

import me.randomhashtags.randomprisons.addon.CellSecurity;
import me.randomhashtags.randomprisons.addon.MiningLevel;
import me.randomhashtags.randomprisons.util.RPAddon;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.math.BigDecimal;

public class FileCellSecurity extends RPAddon implements CellSecurity {
    private ItemStack item;
    public FileCellSecurity(File f) {
        load(f);
    }
    public String getIdentifier() { return getYamlName(); }

    public String getName() { return null; }
    public BigDecimal getPrice() { return BigDecimal.valueOf(yml.getDouble("settings.price")); }
    public Location getTeleportLocation() { return null; }

    public ItemStack getItem() {
        if(item == null) item = api.d(yml, "item");
        return item.clone();
    }
    public MiningLevel getRequiredMiningLevel() { return null; }
}
