package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.Rewardable;

public interface MonthlyCrate extends Itemable, Rewardable {
    int getCategory();
}
