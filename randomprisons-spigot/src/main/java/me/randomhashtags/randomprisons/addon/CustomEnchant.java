package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Applyable;
import me.randomhashtags.randomprisons.addon.util.Energyable;
import me.randomhashtags.randomprisons.addon.util.Identifyable;
import me.randomhashtags.randomprisons.addon.util.Levelable;

import java.util.List;

public interface CustomEnchant extends Energyable, Identifyable, Applyable, Levelable {
    String getName();
    List<String> getLore();
    List<String> getRequirements();
}
