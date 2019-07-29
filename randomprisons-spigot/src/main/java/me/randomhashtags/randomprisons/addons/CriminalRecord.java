package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.active.LivingWarden;
import me.randomhashtags.randomprisons.utils.objects.PolyBoundary;

import java.util.List;

public interface CriminalRecord {
    String getString();
    PolyBoundary getRadius();
    List<LivingWarden> getFollowingGuards();
    boolean nearbyGuardsSetToKill();
    CriminalRecord getRecordAfterDeath();
    long getRecordDecayAtTime();
}
