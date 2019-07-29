package me.randomhashtags.randomprisons.addons.utils;

import java.util.List;

public interface Rewardable extends Itemable {
    String getRewardSize();
    List<String> getRewards();
}
