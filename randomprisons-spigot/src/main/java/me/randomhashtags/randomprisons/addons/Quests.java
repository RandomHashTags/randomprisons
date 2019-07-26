package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;

public abstract class Quests extends Itemable {
    public abstract String getName();
    public abstract String getReward();
    public abstract BigDecimal getCompletion();
}
