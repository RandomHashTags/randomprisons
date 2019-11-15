package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import org.bukkit.OfflinePlayer;

public interface Cell extends Itemable {
    CellSection getSection();
    CellSecurity getCellSecurity();
    long getExpiration();
    OfflinePlayer getOwner();
}
