package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Mineable;
import me.randomhashtags.randomprisons.addon.util.Rewardable;
import me.randomhashtags.randomprisons.addon.util.TimedGeneration;
import me.randomhashtags.randomprisons.util.universal.UMaterial;

public interface Meteor extends Rewardable, TimedGeneration, Mineable {
    String gerSummoner();
    UMaterial getMainOre();
}
