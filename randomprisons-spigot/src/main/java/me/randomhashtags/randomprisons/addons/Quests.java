package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;

public interface Quests extends Itemable {
    String getName();
    String getReward();
    BigDecimal getCompletion();
}
