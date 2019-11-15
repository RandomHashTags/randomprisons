package me.randomhashtags.randomprisons.addon;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public interface Showcase {
    boolean itemsAreRetrievable();
    int getSize();
    HashMap<Integer, ItemStack[]> getContents();
    void setContents(int page, ItemStack[] contents);
}
