package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.util.universal.UMaterial;

import java.util.List;

public interface MineableOre {
    UMaterial getMaterial();
    List<String> getMinableWith();
}
