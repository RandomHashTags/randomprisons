package me.randomhashtags.randomprisons.addons;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class MiningLevel {
    public abstract int getLevel();
    public abstract BigDecimal getLevelXp();
    public abstract List<String> getUnlocked();
    public abstract LinkedHashMap<Prestige, List<String>> getUnlockedByPrestige();
}
