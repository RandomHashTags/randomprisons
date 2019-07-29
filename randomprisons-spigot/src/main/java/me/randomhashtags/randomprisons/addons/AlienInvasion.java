package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Identifyable;
import me.randomhashtags.randomprisons.addons.utils.TimedGeneration;

import java.util.HashMap;
import java.util.List;

public interface AlienInvasion extends Identifyable, TimedGeneration {
    HashMap<Integer, HashMap<Alien, String>> getAliensSpawnedPerWave();
    List<String> getDefeatedMsg();
}
