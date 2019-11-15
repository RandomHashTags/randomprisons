package me.randomhashtags.randomprisons.util.obj;

import org.bukkit.Location;

public class PolyBoundary {
    public final Location center;
    public final int maxX, minX, maxZ, minZ, maxY, minY;
    public PolyBoundary(Location center, int radius) {
        this(center, radius, radius, radius);
    }
    public PolyBoundary(Location center, int x, int y, int z) {
        this.center = center;
        final int cx = center.getBlockX(), cy = center.getBlockY(), cz = center.getBlockZ();
        this.maxX = cx+x;
        this.minX = cx-x;
        this.maxY = cy+y;
        this.minY = cy-y;
        this.maxZ = cz+z;
        this.minZ = cz-z;
    }
    public boolean contains(Location location) {
        final int x = location.getBlockX(), y = location.getBlockY(), z = location.getBlockZ();
        return x <= maxX && x >= minX && y <= maxY && y >= minY && z <= maxZ && z >= minZ;
    }

}
