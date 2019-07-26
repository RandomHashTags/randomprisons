package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Attributeable;

import java.util.List;

public abstract class GangUpgrade extends Attributeable {
    public abstract int getSlot();
    public abstract int getTier();
    public abstract List<String> getCost();
}
