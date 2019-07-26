package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import org.bukkit.OfflinePlayer;

public abstract class Cell extends Itemable {
    public abstract CellSection getSection();
    public abstract CellSecurity getCellSecurity();
    public abstract long getExpiration();
    public abstract OfflinePlayer getOwner();
}
