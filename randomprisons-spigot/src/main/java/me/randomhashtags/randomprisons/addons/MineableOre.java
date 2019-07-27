package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.utils.universal.UMaterial;

public abstract class MineableOre {
    public abstract UMaterial getMaterial();
    public abstract void didMine();
}
