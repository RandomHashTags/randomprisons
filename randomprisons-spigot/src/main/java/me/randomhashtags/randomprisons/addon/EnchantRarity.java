package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Identifiable;
import org.bukkit.inventory.ItemStack;

import java.util.LinkedHashMap;

public interface EnchantRarity extends Identifiable {
    LinkedHashMap<String, CustomEnchant> getEnchants();
    ItemStack getRevealedItem();
    ItemStack getRevealItem();

    static EnchantRarity valueOf(CustomEnchant enchant) {

        return null;
    }
}
