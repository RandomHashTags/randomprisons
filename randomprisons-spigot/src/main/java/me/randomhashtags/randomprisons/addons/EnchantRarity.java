package me.randomhashtags.randomprisons.addons;

import org.bukkit.inventory.ItemStack;

import java.util.LinkedHashMap;

public interface EnchantRarity {
    LinkedHashMap<String, CustomEnchant> getEnchants();
    ItemStack getRevealedItem();
    ItemStack getRevealItem();

    static EnchantRarity valueOf(CustomEnchant enchant) {

        return null;
    }
}
