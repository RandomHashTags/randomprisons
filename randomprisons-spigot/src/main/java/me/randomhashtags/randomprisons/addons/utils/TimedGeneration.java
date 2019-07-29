package me.randomhashtags.randomprisons.addons.utils;

import org.bukkit.Location;

import java.math.BigDecimal;
import java.util.List;

public interface TimedGeneration {
    BigDecimal getMinGenerationTimeInterval();
    BigDecimal getMaxGenerationTimeInterval();
    BigDecimal getMinAppearanceTime();
    BigDecimal getMaxAppearanceTime();

    boolean doesAnnounceCountdown();
    List<String> getCountdownMsg();
    List<String> getAnnounceMsg();

    Location getRandomLocation();
}
