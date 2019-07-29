package me.randomhashtags.randomprisons.addons.utils;

import java.util.List;

public interface Rewardable {
    int getMinRewardSize();
    int getMaxRewardSize();
    List<String> getRewards();
}
