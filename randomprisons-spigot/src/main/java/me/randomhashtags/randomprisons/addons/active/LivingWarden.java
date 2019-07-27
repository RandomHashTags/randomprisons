package me.randomhashtags.randomprisons.addons.active;

import me.randomhashtags.randomprisons.addons.Warden;

import java.util.UUID;

public class LivingWarden {
    private UUID uuid;
    private Warden type;
    private double health;
    private UUID following;
    public LivingWarden(UUID uuid, Warden type, double health, UUID following) {
        this.uuid = uuid;
        this.type = type;
        this.health = health;
        this.following = following;
    }
    public UUID getUUID() { return uuid; }
    public Warden getType() { return type; }
    public double getHealth() { return health; }
    public void setHealth(double health) { this.health = health; }
    public UUID getFollowing() { return following; }
    public void setFollowing(UUID player) { following = player; }
}
