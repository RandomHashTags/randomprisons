package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.active.LivingWarden;
import me.randomhashtags.randomprisons.util.obj.PolyBoundary;

import java.util.List;

public interface CriminalRecord {
    String getString();
    PolyBoundary getRadius();
    List<LivingWarden> getFollowingGuards();
    boolean nearbyGuardsSetToKill();
    CriminalRecord getRecordAfterDeath();
    long getRecordDecayAtTime();
}
