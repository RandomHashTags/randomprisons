package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;

public interface OreGenerator extends Itemable, RequiredMiningLevel {
    long getGenerationTime();
    int getArea();
    Prestige getOrPrestige();
    int getXPMultiplierIfUnderRequiredMiningLevel();
}
