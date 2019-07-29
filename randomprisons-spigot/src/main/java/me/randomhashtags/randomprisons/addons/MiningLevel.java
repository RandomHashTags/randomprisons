package me.randomhashtags.randomprisons.addons;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

public interface MiningLevel {
    int getLevel();
    BigDecimal getLevelXp();
    List<String> getUnlocked();
    LinkedHashMap<Prestige, List<String>> getUnlockedByPrestige();
}
