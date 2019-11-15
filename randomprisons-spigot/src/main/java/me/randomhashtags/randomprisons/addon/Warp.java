package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import me.randomhashtags.randomprisons.addon.util.RequiredMiningLevel;

import javax.xml.stream.Location;
import java.util.List;

public interface Warp extends Itemable, RequiredMiningLevel {
    String getName();
    Location getLocation();
    byte getDanger();
    List<String> getAllowedEquipment();
    int getMaxAllowedItemLevel();
}
