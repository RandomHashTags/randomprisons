package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.utils.universal.UMaterial;

import java.util.List;

public interface MineableOre {
    UMaterial getMaterial();
    List<String> getMinableWith();
}
