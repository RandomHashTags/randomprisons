package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Mineable;
import me.randomhashtags.randomprisons.addons.utils.Rewardable;
import me.randomhashtags.randomprisons.addons.utils.TimedGeneration;
import me.randomhashtags.randomprisons.utils.universal.UMaterial;

public interface Meteor extends Rewardable, TimedGeneration, Mineable {
    String gerSummoner();
    UMaterial getMainOre();
}
