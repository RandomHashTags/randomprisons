package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Attributeable;
import me.randomhashtags.randomprisons.addon.util.EntityRewardable;
import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.Levelable;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;

import java.math.BigDecimal;
import java.util.List;

public abstract class Guard implements Itemable, Levelable, EntityRewardable, Attributeable {
    private int damage, range, speed, health, regen;
    private BigDecimal xp, completion;

    public abstract boolean staresAtNearbyPlayer();
    public abstract int getNearbyRadius();
    public abstract int getMaxHealth();
    public abstract EntityEquipment getEquipment();
    public abstract List<PotionEffect> getPotionEffects();

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getRange() { return range; }
    public void setRange(int range) { this.range = range; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getHealth() { return health; }
    public void setHealth(int health) {
        final int max = getMaxHealth();
        this.health = health > max ? max : health;
    }

    public int getRegen() { return regen; }
    public void setRegen(int regen) { this.regen = regen; }

    public BigDecimal getXP() { return xp; }
    public void setXP(BigDecimal xp) { this.xp = xp; }
    public BigDecimal getCompletion() { return completion; }
    public void setCompletion(BigDecimal completion) { this.completion = completion; }
}
