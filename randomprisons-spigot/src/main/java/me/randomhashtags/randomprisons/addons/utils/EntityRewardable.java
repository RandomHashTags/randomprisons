package me.randomhashtags.randomprisons.addons.utils;

import java.util.List;

public interface EntityRewardable {
    int getMinRewardSize();
    int getMaxRewardSize();
    List<String> getRewards();
}
