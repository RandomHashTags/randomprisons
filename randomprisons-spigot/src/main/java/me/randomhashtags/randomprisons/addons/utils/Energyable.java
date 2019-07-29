package me.randomhashtags.randomprisons.addons.utils;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public interface Energyable {
    boolean isEnergyable();
    LinkedHashMap<Integer, BigDecimal> getMaxEnergyXP(); // <Level, Max Energy>
}
