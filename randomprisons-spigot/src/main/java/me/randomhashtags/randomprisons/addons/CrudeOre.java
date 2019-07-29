package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;

public interface CrudeOre extends Itemable, RequiredMiningLevel {
    double getGenerationRate();
}
