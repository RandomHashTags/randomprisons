package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Levelable;
import me.randomhashtags.randomprisons.addon.util.RequiredMiningLevel;
import me.randomhashtags.randomprisons.util.universal.UMaterial;

public interface RPEquipment extends RequiredMiningLevel, Levelable {
    UMaterial getMaterial();
}
