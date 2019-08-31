package me.randomhashtags.randomprisons.utils;

import me.randomhashtags.randomprisons.addons.*;
import me.randomhashtags.randomprisons.addons.objects.PlayerOptions;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

public class RPPlayer extends RPAddon implements RPPlayerData {
    private boolean isLoaded = false;
    private UUID uuid;
    private long playtime;

    private Cell cell;
    private PlayerOptions options;
    private MiningLevel levelcap, mininglevel;
    private CriminalRecord record;
    private BigDecimal blocksMined, raidsCompleted, miningxp, drankMiningXP;
    private long drankMiningXPExpiration;
    private KillTag killtag;
    private Set<PlayerAttribute> attributes;

    protected RPPlayer(UUID uuid) {
        this.uuid = uuid;
        load();
    }

    public boolean isLoaded() { return isLoaded; }
    public void load() {
        if(!isLoaded) {
            isLoaded = true;
            load(new File(uuid.toString() + ".yml"));
        }
    }
    public void unload() {
        if(isLoaded) {
            isLoaded = false;
        }
    }

    public UUID getUUID() { return uuid; }
    public long getPlayTime() { return playtime; }
    public Cell getCell() {
        if(cell == null) {
        }
        return cell;
    }
    public PlayerOptions getOptions() {
        if(options == null) {
        }
        return options;
    }
    public MiningLevel getLevelCap() {
        if(levelcap == null) {
        }
        return levelcap;
    }
    public MiningLevel getMiningLevel() {
        if(mininglevel == null) {
        }
        return mininglevel;
    }
    public CriminalRecord getCriminalRecord() {
        if(record == null) {
        }
        return record;
    }
    public KillTag getKillTag() {
        if(killtag == null) {
            final String tag = yml.getString("kill tag");
            killtag = tag != null && !tag.equals("nil") ? getKillTag(tag) : null;
        }
        return killtag;
    }
    public Set<PlayerAttribute> getPlayerAttributes() {
        if(attributes == null) {
            attributes = new HashSet<>();
            final List<String> a = yml.getStringList("player attributes");
            for(String s : a) {
                final PlayerAttribute att = getPlayerAttribute(s);
                if(att != null) {
                    attributes.add(att);
                }
            }
        }
        return attributes;
    }
    public BigDecimal getBlocksMined() {
        if(blocksMined == null) blocksMined = BigDecimal.valueOf(yml.getDouble("big decimals.blocks mined"));
        return blocksMined;
    }
    public BigDecimal getRaidsCompleted() {
        if(raidsCompleted == null) raidsCompleted = BigDecimal.valueOf(yml.getDouble("big decimals.raids completed"));
        return raidsCompleted;
    }
    public BigDecimal getMiningXp() {
        if(miningxp == null) miningxp = BigDecimal.valueOf(yml.getDouble("big decimals.mining xp"));
        return miningxp;
    }
    public BigDecimal getDrankMiningXp() {
        if(drankMiningXP == null) drankMiningXP = BigDecimal.valueOf(yml.getDouble("big decimals.drank mining xp"));
        return drankMiningXP;
    }

    private String[] getExpirations() { return yml.getString("expirations").split(";"); }
    public long getDrankMiningXpExpiration() { return Long.parseLong(getExpirations()[0]); }
}
