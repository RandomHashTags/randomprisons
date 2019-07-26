package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

public abstract class OreGenerator extends Itemable {
    public abstract long getGenerationTime();
    public abstract int getArea();
    public abstract MiningLevel getRequiredMiningLevel();
    public abstract Prestige getOrPrestige();
    public abstract int getXPMultiplierIfUnderRequiredMiningLevel();
}
