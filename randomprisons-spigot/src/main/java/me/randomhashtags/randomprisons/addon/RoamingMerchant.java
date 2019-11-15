package me.randomhashtags.randomprisons.addon;

import java.util.List;

public interface RoamingMerchant {
    String getSpawnInterval();
    List<RoamingMerchantBodyguard> getBodyguards();
    String getSpawnedBodyguards();
    boolean canBeDamagedIfHasBodyguards();
    boolean canBeKilledIfHasBodyguards();
}
