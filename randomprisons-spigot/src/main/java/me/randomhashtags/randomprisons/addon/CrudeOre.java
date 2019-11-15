package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.RequiredMiningLevel;

public interface CrudeOre extends Itemable, RequiredMiningLevel {
    double getGenerationRate();
}
