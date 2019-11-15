package me.randomhashtags.randomprisons.addon.obj;

import me.randomhashtags.randomprisons.addon.GangRelation;

public class GangRelationship {
    private long started;
    private GangRelation relation;
    public GangRelationship(long started, GangRelation relation) {
        this.started = started;
        this.relation = relation;
    }
    public long getStarted() { return started; }
    public me.randomhashtags.randomprisons.addon.GangRelation getRelation() { return relation; }
}
