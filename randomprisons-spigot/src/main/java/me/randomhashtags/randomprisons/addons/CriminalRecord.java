package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.active.LivingWarden;
import me.randomhashtags.randomprisons.utils.objects.PolyBoundary;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class CriminalRecord {
    public abstract String getString();
    public abstract PolyBoundary getRadius();
    public abstract List<LivingWarden> getFollowingGuards();
    public abstract boolean nearbyGuardsSetToKill();
    public abstract CriminalRecord getRecordAfterDeath();
    public abstract long getRecordDecayAtTime();
    public abstract void didDie(Player killer);
}
