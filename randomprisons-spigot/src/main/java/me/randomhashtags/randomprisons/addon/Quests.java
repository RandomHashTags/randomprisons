package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Completeable;
import me.randomhashtags.randomprisons.addon.util.Itemable;

public interface Quests extends Itemable, Completeable {
    String getName();
    String getReward();
}
