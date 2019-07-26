package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public abstract class EnergyForgeFuel extends Itemable {
    public abstract LinkedHashMap<EnergyForge, BigDecimal> getRates();
}
