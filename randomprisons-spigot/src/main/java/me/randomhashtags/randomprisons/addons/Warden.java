package me.randomhashtags.randomprisons.addons;

import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;

import java.util.List;

public abstract class Warden {
    public abstract boolean staresAtNearbyPlayer();
    public abstract int nearbyRadius();
    public abstract double getMaxHealth();
    public abstract EntityEquipment getEquipment();
    public abstract List<PotionEffect> getPotionEffects();
}
