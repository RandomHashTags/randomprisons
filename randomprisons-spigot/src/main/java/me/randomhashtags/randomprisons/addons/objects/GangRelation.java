package me.randomhashtags.randomprisons.addons.objects;

import me.randomhashtags.randomprisons.addons.enums.GangRelationEnum;

public class GangRelation {
    private long started;
    private GangRelationEnum relation;
    public GangRelation(long started, GangRelationEnum relation) {
        this.started = started;
        this.relation = relation;
    }
    public long getStarted() { return started; }
    public GangRelationEnum getRelation() { return relation; }
}
