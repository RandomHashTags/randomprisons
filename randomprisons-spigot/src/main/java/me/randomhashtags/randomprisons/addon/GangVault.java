package me.randomhashtags.randomprisons.addon;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface GangVault {
    List<String> getAllowedItems();
    ItemStack[] getContents();
}
