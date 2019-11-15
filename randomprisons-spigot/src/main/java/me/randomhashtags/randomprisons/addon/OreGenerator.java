package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.RequiredMiningLevel;

public interface OreGenerator extends Itemable, RequiredMiningLevel {
    long getGenerationTime();
    int getArea();
    Prestige getOrPrestige();
    int getXPMultiplierIfUnderRequiredMiningLevel();
}
