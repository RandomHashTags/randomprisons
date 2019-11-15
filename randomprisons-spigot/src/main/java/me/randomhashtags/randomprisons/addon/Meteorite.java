package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.RequiredMiningLevel;
import me.randomhashtags.randomprisons.addon.util.Rewardable;
import me.randomhashtags.randomprisons.addon.util.TimedGeneration;
import me.randomhashtags.randomprisons.util.universal.UMaterial;

public interface Meteorite extends Rewardable, TimedGeneration, RequiredMiningLevel {
    UMaterial getAppearance();
}
