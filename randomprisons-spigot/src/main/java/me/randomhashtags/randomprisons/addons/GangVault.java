package me.randomhashtags.randomprisons.addons;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface GangVault {
    List<String> getAllowedItems();
    ItemStack[] getContents();
}
