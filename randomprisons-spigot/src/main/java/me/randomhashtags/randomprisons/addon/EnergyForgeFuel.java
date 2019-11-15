package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public interface EnergyForgeFuel extends Itemable {
    LinkedHashMap<EnergyForge, BigDecimal> getRates();
}
