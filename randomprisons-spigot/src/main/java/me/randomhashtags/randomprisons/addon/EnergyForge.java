package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;

public interface EnergyForge extends Itemable {
    int getMaxFuel();
    int getEnergyPerHourOfFuel();
    CellSecurity getMinCellSecurity();
}
