package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Identifyable;
import me.randomhashtags.randomprisons.addon.util.TimedGeneration;

import java.util.HashMap;
import java.util.List;

public interface AlienInvasion extends Identifyable, TimedGeneration {
    HashMap<Integer, HashMap<Alien, String>> getAliensSpawnedPerWave();
    List<String> getDefeatedMsg();
}
