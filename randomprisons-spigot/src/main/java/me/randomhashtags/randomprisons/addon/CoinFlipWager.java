package me.randomhashtags.randomprisons.addon;

import me.randomhashtags.randomprisons.addon.util.Itemable;
import org.bukkit.entity.Player;

import java.math.BigDecimal;

public interface CoinFlipWager extends Itemable {
    Player getPlayer();
    BigDecimal getWager();
    String getColorChosen();
}
