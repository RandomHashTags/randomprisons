package me.randomhashtags.randomprisons.addon.util;

import java.util.List;

public interface EntityRewardable {
    int getMinRewardSize();
    int getMaxRewardSize();
    List<String> getRewards();
}
