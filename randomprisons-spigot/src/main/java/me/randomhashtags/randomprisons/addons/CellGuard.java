package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.math.BigDecimal;

public abstract class CellGuard extends Itemable {
    private int damage, range, speed, health, regen;
    private BigDecimal xp, completion;

    public abstract int getMaxLevel();

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getRange() { return range; }
    public void setRange(int range) { this.range = range; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getRegen() { return regen; }
    public void setRegen(int regen) { this.regen = regen; }

    public BigDecimal getXP() { return xp; }
    public void setXP(BigDecimal xp) { this.xp = xp; }
    public BigDecimal getCompletion() { return completion; }
    public void setCompletion(BigDecimal completion) { this.completion = completion; }
}
