package me.randomhashtags.randomprisons.addons;

import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;

import java.util.List;

public interface Warden {
    boolean staresAtNearbyPlayer();
    int getNearbyRadius();
    double getMaxHealth();
    EntityEquipment getEquipment();
    List<PotionEffect> getPotionEffects();
}
