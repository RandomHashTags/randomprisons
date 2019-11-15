package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Attributeable;
import me.randomhashtags.randomprisons.addon.util.Itemable;

import java.math.BigDecimal;

public interface Trinket extends Itemable, Attributeable {
    int getCharges();
    BigDecimal getEnergy();
    BigDecimal getEnergyPerUse();
    long getCooldown();
}
