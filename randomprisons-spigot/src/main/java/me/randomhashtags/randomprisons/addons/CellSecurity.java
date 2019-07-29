package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;
import org.bukkit.Location;

import java.math.BigDecimal;

public interface CellSecurity extends Itemable, RequiredMiningLevel {
    String getName();
    BigDecimal getPrice();
    Location getTeleportLocation();
}
