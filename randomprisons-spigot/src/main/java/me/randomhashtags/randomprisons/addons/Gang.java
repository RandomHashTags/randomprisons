package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.objects.GangRelation;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public abstract class Gang {
    public abstract UUID getUUID();
    public abstract UUID getOwner();
    public abstract String getTitle();
    public abstract String getInfo();
    public abstract String getDescription();
    public abstract HashMap<UUID, String> getTags();
    public abstract BigDecimal getBank();
    public abstract List<GangUpgrade> getUpgrades();
    public abstract LinkedHashMap<UUID, GangRelation> getRelations();
}
