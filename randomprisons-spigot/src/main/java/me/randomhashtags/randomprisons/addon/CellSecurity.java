package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.RequiredMiningLevel;
import org.bukkit.Location;

import java.math.BigDecimal;

public interface CellSecurity extends Itemable, RequiredMiningLevel {
    String getName();
    BigDecimal getPrice();
    Location getTeleportLocation();
}
