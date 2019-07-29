package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Applyable;
import me.randomhashtags.randomprisons.addons.utils.Energyable;
import me.randomhashtags.randomprisons.addons.utils.Identifyable;
import me.randomhashtags.randomprisons.addons.utils.Levelable;

import java.util.List;

public interface CustomEnchant extends Energyable, Identifyable, Applyable, Levelable {
    String getName();
    List<String> getLore();
    List<String> getRequirements();
}
