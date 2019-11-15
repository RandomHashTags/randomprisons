package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Attributeable;
import me.randomhashtags.randomprisons.addon.util.Itemable;

import java.util.List;

public interface GangUpgrade extends Itemable, Attributeable {
    int getSlot();
    int getMaxLevel();
    List<String> getCost();
}
