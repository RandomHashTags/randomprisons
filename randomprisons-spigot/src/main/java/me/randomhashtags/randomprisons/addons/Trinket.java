package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Attributeable;

import java.math.BigDecimal;

public abstract class Trinket extends Attributeable {
    public abstract int getCharges();
    public abstract BigDecimal getEnergy();
    public abstract BigDecimal getEnergyPerUse();
    public abstract long getCooldown();
}
