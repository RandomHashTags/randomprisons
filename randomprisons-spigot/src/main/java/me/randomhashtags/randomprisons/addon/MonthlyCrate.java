package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.Rewardable;

public interface MonthlyCrate extends Itemable, Rewardable {
    int getCategory();
}
