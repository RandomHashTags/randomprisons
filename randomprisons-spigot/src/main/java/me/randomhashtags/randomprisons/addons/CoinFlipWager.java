package me.randomhashtags.randomprisons.addons;

import me.randomhashtags.randomprisons.addons.utils.Itemable;
import org.bukkit.entity.Player;

import java.math.BigDecimal;

public interface CoinFlipWager extends Itemable {
    Player getPlayer();
    BigDecimal getWager();
    String getColorChosen();
}
