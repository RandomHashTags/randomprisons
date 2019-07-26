package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Applyable;
import me.randomhashtags.randomprisons.addons.utils.Identifyable;

import java.util.List;

public abstract class CustomEnchant extends Identifyable implements Applyable {
    public abstract int getMaxLevel();
    public abstract List<String> getLore();
    public abstract List<String> getRequirements();
}
