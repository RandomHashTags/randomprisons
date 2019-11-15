package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Attributeable;
import me.randomhashtags.randomprisons.addon.util.Itemable;
import org.bukkit.Location;
import org.bukkit.scoreboard.Scoreboard;

import java.util.List;

public interface Outpost extends Itemable, Attributeable {
    void updateItem();

    List<String> getBlacklistedCommands();
    Location getLocation();
    List<String> getAllowedEquipment();
    boolean attackingGangCanControlWhileDefendingGangIsThere();
    Scoreboard getScoreboard();
    void updateScoreboard();

    Gang getControlling();
    void setControlling(Gang gang);
    Gang getAttacking();
    void setAttacking(Gang gang);

    String getStatus();
    void setStatus();
    double getCapturePercent();
    void setCapturePercent(double percent);
}
