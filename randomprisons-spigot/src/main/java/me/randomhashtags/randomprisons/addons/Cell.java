package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import org.bukkit.OfflinePlayer;

public interface Cell extends Itemable {
    CellSection getSection();
    CellSecurity getCellSecurity();
    long getExpiration();
    OfflinePlayer getOwner();
}
