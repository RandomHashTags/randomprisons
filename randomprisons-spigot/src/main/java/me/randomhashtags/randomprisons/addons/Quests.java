package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Completeable;
import me.randomhashtags.randomprisons.addons.utils.Itemable;

public interface Quests extends Itemable, Completeable {
    String getName();
    String getReward();
}
