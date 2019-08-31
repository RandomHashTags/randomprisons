package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.objects.PlayerOptions;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public interface RPPlayerData {
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
