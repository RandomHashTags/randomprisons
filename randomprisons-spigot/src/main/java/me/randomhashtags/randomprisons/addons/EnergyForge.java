package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

public interface EnergyForge extends Itemable {
    int getMaxFuel();
    int getEnergyPerHourOfFuel();
    CellSecurity getMinCellSecurity();
}
