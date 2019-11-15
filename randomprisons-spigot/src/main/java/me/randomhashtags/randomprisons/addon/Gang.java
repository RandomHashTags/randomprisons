package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.obj.GangRelationship;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public interface Gang {
    UUID getUUID();
    UUID getOwner();
    String getTitle();
    String getInfo();
    String getDescription();
    HashMap<UUID, String> getTags();
    BigDecimal getBank();
    List<GangUpgrade> getUpgrades();
    LinkedHashMap<UUID, GangRelationship> getRelations();
}
