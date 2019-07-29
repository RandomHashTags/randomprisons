package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Identifyable;
import org.bukkit.inventory.ItemStack;

import java.util.LinkedHashMap;

public interface EnchantRarity extends Identifyable {
    LinkedHashMap<String, CustomEnchant> getEnchants();
    ItemStack getRevealedItem();
    ItemStack getRevealItem();

    static EnchantRarity valueOf(CustomEnchant enchant) {

        return null;
    }
}
