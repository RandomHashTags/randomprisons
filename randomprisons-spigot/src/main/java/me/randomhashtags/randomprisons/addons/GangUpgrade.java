package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Attributeable;
import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.util.List;

public interface GangUpgrade extends Itemable, Attributeable {
    int getSlot();
    int getTier();
    List<String> getCost();
}
