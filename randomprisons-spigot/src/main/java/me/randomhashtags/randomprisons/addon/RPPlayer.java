package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.obj.PlayerOptions;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public interface RPPlayer {
    UUID getUUID();
    long getPlayTime();
    Cell getCell();
    PlayerOptions getOptions();
    MiningLevel getLevelCap();
    MiningLevel getMiningLevel();
    CriminalRecord getCriminalRecord();
    KillTag getKillTag();
    Set<PlayerAttribute> getPlayerAttributes();
    default boolean hasPlayerAttribute(PlayerAttribute attribute) {
        final Set<PlayerAttribute> a = getPlayerAttributes();
        return a != null && a.contains(attribute);
    }
    BigDecimal getBlocksMined();
    BigDecimal getRaidsCompleted();
    BigDecimal getMiningXp();
    BigDecimal getDrankMiningXp();
    long getDrankMiningXpExpiration();
}
