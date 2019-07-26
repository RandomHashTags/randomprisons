package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

public abstract class EnergyForge extends Itemable {
    public abstract int getMaxFuel();
    public abstract int getEnergyPerHourOfFuel();
    public abstract CellSecurity getMinCellSecurity();
}
