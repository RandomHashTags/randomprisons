package me.randomhashtags.randomprisons.utils;

import me.randomhashtags.randomprisons.addons.*;
import me.randomhashtags.randomprisons.addons.objects.PlayerOptions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RPPlayer {
    private boolean isLoaded = false;
    private long playtime;

    private Cell cell;
    private PlayerOptions options;
    private MiningLevel levelcap, mininglevel;
    private CriminalRecord record;
    private BigDecimal blocksMined, raidsCompleted, miningxp;
    private KillTag killtag;
    private List<PlayerAttribute> attributes;

    public boolean isLoaded() { return isLoaded; }
    public void load() {
        if(!isLoaded) {
            isLoaded = true;
        }
    }
    public void unload() {
        if(isLoaded) {
            isLoaded = false;
        }
    }


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
        }
        return killtag;
    }
    public List<PlayerAttribute> getAttributes() {
        if(attributes == null) {
            attributes = new ArrayList<>();
        }
        return attributes;
    }
}
