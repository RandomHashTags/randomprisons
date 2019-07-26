package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

public abstract class CellSection extends Itemable {
    public abstract String getSectionName();
    public abstract int getMaxCells();
    public abstract CellSecurity getSecurity();
}
