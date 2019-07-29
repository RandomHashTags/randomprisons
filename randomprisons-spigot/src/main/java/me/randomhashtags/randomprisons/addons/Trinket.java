package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Attributeable;
import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;

public interface Trinket extends Itemable, Attributeable {
    int getCharges();
    BigDecimal getEnergy();
    BigDecimal getEnergyPerUse();
    long getCooldown();
}
