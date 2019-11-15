package me.randomhashtags.randomprisons.addon.util;

import java.util.List;

public interface Applyable {
    List<String> getAppliesTo();
    boolean doesApplyLore();
    String getApplied();
}
