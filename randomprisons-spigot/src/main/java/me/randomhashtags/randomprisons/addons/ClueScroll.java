package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;

public interface ClueScroll extends Itemable, RequiredMiningLevel {
    ItemStack getUndiscovered();
    ClueCasket getCasket();

    String getStepCompletedPrefix();
    List<String> getDecodedMsg();
    List<String> getStepCompletedMsg();
    List<String> getScrollCompletedMsg();

    int getStepsToComplete();
    HashMap<Integer, HashMap<String, List<String>>> getSteps();
}
