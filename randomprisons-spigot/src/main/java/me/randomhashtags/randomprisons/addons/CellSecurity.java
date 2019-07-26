package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import org.bukkit.Location;

import java.math.BigDecimal;

public abstract class CellSecurity extends Itemable {
    public abstract String getName();
    public abstract int getRequiredMiningLevel();
    public abstract BigDecimal getPrice();
    public abstract Location getTeleportLocation();
}
