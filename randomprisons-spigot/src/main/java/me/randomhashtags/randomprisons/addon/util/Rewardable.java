package me.randomhashtags.randomprisons.addon.util;

import java.util.List;

public interface Rewardable {
    int getMinRewardSize();
    int getMaxRewardSize();
    List<String> getRewards();
}
