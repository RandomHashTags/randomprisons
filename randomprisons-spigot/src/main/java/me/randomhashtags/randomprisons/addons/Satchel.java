package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Attributeable;
import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public interface Satchel extends Itemable, Attributeable {
    int getMinSatchelLevelToApplyEnchants();
    LinkedHashMap<Integer, BigDecimal> getRequiredXP();
    LinkedHashMap<Integer, BigDecimal> getMaxCapacity();
}
