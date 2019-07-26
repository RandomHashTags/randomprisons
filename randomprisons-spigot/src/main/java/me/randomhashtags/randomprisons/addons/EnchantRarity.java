package me.randomhashtags.randomprisons.addons;

import org.bukkit.inventory.ItemStack;

import java.util.LinkedHashMap;

public abstract class EnchantRarity {
    public abstract LinkedHashMap<String, CustomEnchant> getEnchants();
    public abstract ItemStack getRevealedItem();
    public abstract ItemStack getRevealItem();

    public static EnchantRarity valueOf(CustomEnchant enchant) {

        return null;
    }
}
