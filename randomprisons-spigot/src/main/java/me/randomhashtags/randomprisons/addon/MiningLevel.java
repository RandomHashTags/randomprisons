package me.randomhashtags.randomprisons.addon;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface MiningLevel {
    int getLevel();
    BigDecimal getLevelXp();
    List<String> getPermanentUnlocks();
    LinkedHashMap<Prestige, List<String>> getUnlockedByPrestige();
}
