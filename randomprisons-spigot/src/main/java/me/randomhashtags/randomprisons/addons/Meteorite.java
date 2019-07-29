package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;
import me.randomhashtags.randomprisons.addons.utils.Rewardable;
import me.randomhashtags.randomprisons.addons.utils.TimedGeneration;
import me.randomhashtags.randomprisons.utils.universal.UMaterial;

public interface Meteorite extends Rewardable, TimedGeneration, RequiredMiningLevel {
    UMaterial getAppearance();
}
