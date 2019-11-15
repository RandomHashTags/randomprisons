package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Attributeable;
import me.randomhashtags.randomprisons.addon.util.Itemable;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public interface Satchel extends Itemable, Attributeable {
    int getMinSatchelLevelToApplyEnchants();
    LinkedHashMap<Integer, BigDecimal> getRequiredXP();
    LinkedHashMap<Integer, BigDecimal> getMaxCapacity();
}
