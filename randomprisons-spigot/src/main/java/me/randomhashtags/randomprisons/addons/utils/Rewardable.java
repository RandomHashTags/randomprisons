package me.randomhashtags.randomprisons.addons.utils;

import java.util.List;

public abstract class Rewardable extends Itemable {
    public abstract String getRewardSize();
    public abstract List<String> getRewards();
}
