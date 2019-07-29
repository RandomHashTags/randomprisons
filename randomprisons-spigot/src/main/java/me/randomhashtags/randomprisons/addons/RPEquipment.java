package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Levelable;
import me.randomhashtags.randomprisons.addons.utils.RequiredMiningLevel;
import me.randomhashtags.randomprisons.utils.universal.UMaterial;

public interface RPEquipment extends RequiredMiningLevel, Levelable {
    UMaterial getMaterial();
}
