package me.randomhashtags.randomprisons.addons.utils;

import java.util.List;

public interface Applyable {
    List<String> getAppliesTo();
    boolean doesApplyLore();
    String getApplied();
}
