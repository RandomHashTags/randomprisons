package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public interface EnergyForgeFuel extends Itemable {
    LinkedHashMap<EnergyForge, BigDecimal> getRates();
}
