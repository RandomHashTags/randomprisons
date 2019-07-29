package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;

import java.util.List;

public interface CellSection extends Itemable {
    String getSectionName();
    int getMaxCells();
    CellSecurity getSecurity();
    List<String> getNeedsToBeAtLeastLevelToOwnCell();
}
