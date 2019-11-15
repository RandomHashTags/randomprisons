package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;

import java.util.List;

public interface CellSection extends Itemable {
    String getSectionName();
    int getMaxCells();
    CellSecurity getSecurity();
    List<String> getNeedsToBeAtLeastLevelToOwnCell();
}
