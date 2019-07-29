package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;

import javax.xml.stream.Location;
import java.util.List;

public interface Warp extends Itemable, RequiredMiningLevel {
    String getName();
    Location getLocation();
    byte getDanger();
    List<String> getAllowedEquipment();
    int getMaxAllowedItemLevel();
}
