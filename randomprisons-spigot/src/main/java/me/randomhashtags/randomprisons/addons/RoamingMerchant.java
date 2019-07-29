package me.randomhashtags.randomprisons.addons;

import java.util.List;

public interface RoamingMerchant {
    String getSpawnInterval();
    List<RoamingMerchantBodyguard> getBodyguards();
    String getSpawnedBodyguards();
    boolean canBeDamagedIfHasBodyguards();
    boolean canBeKilledIfHasBodyguards();
}
