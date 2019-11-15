package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Attributeable;
import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.Levelable;

import java.util.HashMap;

public abstract class InventoryPet implements Itemable, Levelable, Attributeable {
    public abstract HashMap<String, Double> getOutgoingDamageMultipliers();
    public abstract HashMap<String, Double> getIncomingDamageMultipliers();
    public abstract HashMap<String, Long> getDurations();
    public abstract HashMap<String, Long> getCooldowns();
    public abstract HashMap<String, Long> getRequiredXpForLevels();
    public abstract HashMap<String, Long> getXpGainedPerUse();

    public double getOutgoingDamageMultiplier(int level) {
        final HashMap<String, Double> o = getOutgoingDamageMultipliers();
        return o != null ? o.getOrDefault(Integer.toString(level), o.get("all")) : -1;
    }
    public double getIncomingDamageMultiplier(int level) {
        final HashMap<String, Double> i = getIncomingDamageMultipliers();
        return i != null ? i.getOrDefault(Integer.toString(level), i.get("all")) : -1;
    }
    public long getDuration(int level) {
        final HashMap<String, Long> d = getDurations();
        return d != null ? d.getOrDefault(Integer.toString(level), d.get("all")) : -1;
    }
    public long getCooldown(int level) {
        final HashMap<String, Long> c = getCooldowns();
        return c != null ? c.getOrDefault(Integer.toString(level), c.get("all")) : 0;
    }
    public long getXpGainedPerUse(int level) {
        final HashMap<String, Long> x = getXpGainedPerUse();
        return x != null ? x.getOrDefault(Integer.toString(level), x.get("all")) : 0;
    }
}
