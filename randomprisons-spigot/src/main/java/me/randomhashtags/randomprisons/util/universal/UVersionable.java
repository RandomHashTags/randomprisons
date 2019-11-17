package me.randomhashtags.randomprisons.util.universal;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import me.randomhashtags.randomprisons.RandomPrisons;
import org.bukkit.*;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;

import java.io.File;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public interface UVersionable {
    Server server = Bukkit.getServer();
    BukkitScheduler scheduler = Bukkit.getScheduler();
    ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
    PluginManager pluginmanager = Bukkit.getPluginManager();
    ConsoleCommandSender console = Bukkit.getConsoleSender();

    RandomPrisons randomprisons = RandomPrisons.getPlugin;
    File dataFolder = randomprisons.getDataFolder();
    Random random = new Random();


    default ItemStack getClone(@Nullable ItemStack is) {
        return getClone(is, null);
    }
    default ItemStack getClone(@Nullable ItemStack is, @Nullable ItemStack def) {
        return is != null ? is.clone() : def;
    }
    default Color getColor(final String path) {
        if(path == null) {
            return null;
        } else {
            switch (path.toLowerCase()) {
                case "aqua": return Color.AQUA;
                case "black": return Color.BLACK;
                case "blue": return Color.BLUE;
                case "fuchsia": return Color.FUCHSIA;
                case "gray": return Color.GRAY;
                case "green": return Color.GREEN;
                case "lime": return Color.LIME;
                case "maroon": return Color.MAROON;
                case "navy": return Color.NAVY;
                case "olive": return Color.OLIVE;
                case "orange": return Color.ORANGE;
                case "purple": return Color.PURPLE;
                case "red": return Color.RED;
                case "silver": return Color.SILVER;
                case "teal": return Color.TEAL;
                case "white": return Color.WHITE;
                case "yellow": return Color.YELLOW;
                default: return null;
            }
        }
    }
    default PotionEffectType getPotionEffectType(@Nullable String input) {
        if(input != null && !input.isEmpty()) {
            switch (input.toUpperCase()) {
                case "STRENGTH": return PotionEffectType.INCREASE_DAMAGE;
                case "MINING_FATIGUE": return PotionEffectType.SLOW_DIGGING;
                case "SLOWNESS": return PotionEffectType.SLOW;
                case "HASTE": return PotionEffectType.FAST_DIGGING;
                case "JUMP": return PotionEffectType.JUMP;
                case "INSTANT_HEAL":
                case "INSTANT_HEALTH": return PotionEffectType.HEAL;
                case "INSTANT_HARM":
                case "INSTANT_DAMAGE": return PotionEffectType.HARM;
                default:
                    for(PotionEffectType p : PotionEffectType.values()) {
                        if(p != null && input.equalsIgnoreCase(p.getName())) {
                            return p;
                        }
                    }
                    return null;
            }
        } else {
            return null;
        }
    }
    default void sendConsoleMessage(@NotNull String msg) {
        console.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }
    default void sendStringListMessage(@NotNull CommandSender sender, @Nullable List<String> message, @Nullable HashMap<String, String> replacements) {
        if(message != null && message.size() > 0 && !message.get(0).equals("")) {
            for(String s : message) {
                if(replacements != null) {
                    for(String r : replacements.keySet()) {
                        s = s.replace(r, replacements.get(r));
                    }
                }
                if(s != null) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', s));
                }
            }
        }
    }

    default String formatDouble(double d) {
        String decimals = Double.toString(d).split("\\.")[1];
        if(decimals.equals("0")) { decimals = ""; } else { decimals = "." + decimals; }
        return formatInt((int) d) + decimals;
    }
    default String formatLong(long l) {
        final String f = Long.toString(l);
        final boolean c = f.contains(".");
        String decimals = c ? f.split("\\.")[1] : f;
        decimals = c ? decimals.equals("0") ? "" : "." + decimals : "";
        return formatInt((int) l) + decimals;
    }
    default String formatBigDecimal(BigDecimal b) { return formatBigDecimal(b, false); }
    default String formatBigDecimal(BigDecimal b, boolean currency) { return (currency ? NumberFormat.getCurrencyInstance() : NumberFormat.getInstance()).format(b); }
    default String formatInt(int integer) { return String.format("%,d", integer); }

    default int getRemainingInt(String string) {
        string = ChatColor.stripColor(ChatColor.translateAlternateColorCodes('&', string)).replaceAll("\\p{L}", "").replaceAll("\\s", "").replaceAll("\\p{P}", "").replaceAll("\\p{S}", "");
        return string.isEmpty() ? -1 : Integer.parseInt(string);
    }
    default Double getRemainingDouble(String string) {
        string = ChatColor.stripColor(ChatColor.translateAlternateColorCodes('&', string).replaceAll("\\p{L}", "").replaceAll("\\p{Z}", "").replaceAll("\\.", "d").replaceAll("\\p{P}", "").replaceAll("\\p{S}", "").replace("d", "."));
        return string.isEmpty() ? -1.00 : Double.parseDouble(string.contains(".") && string.split("\\.").length > 1 && string.split("\\.")[1].length() > 2 ? string.substring(0, string.split("\\.")[0].length() + 3) : string);
    }
    default BigDecimal valueOfBigDecimal(String value) {
        return BigDecimal.valueOf(Double.parseDouble(value));
    }

    default List<String> colorizeListString(List<String> input) {
        final List<String> i = new ArrayList<>();
        for(String s : input) {
            i.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        return i;
    }
    default String colorize(@NotNull String input) { return input != null ? ChatColor.translateAlternateColorCodes('&', input) : ""; }
    default String toReadableDate(@NotNull Date d, @NotNull String format) { return new SimpleDateFormat(format).format(d); }

    default double levelToExp(int level) { return level <= 16 ? (level * level) + (level * 6) : level <= 31 ? (2.5 * level * level) - (40.5 * level) + 360 : (4.5 * level * level) - (162.5 * level) + 2220; }
    default int getTotalExperience(@NotNull Player player) {
        final double levelxp = levelToExp(player.getLevel()), nextlevelxp = levelToExp(player.getLevel() + 1), difference = nextlevelxp - levelxp;
        final double p = (levelxp + (difference * player.getExp()));
        return (int) Math.round(p);
    }
    default void setTotalExperience(@NotNull Player player, int total) {
        player.setTotalExperience(0);
        player.setExp(0f);
        player.setLevel(0);
        player.giveExp(total);
    }

    default String toString(@NotNull Location loc) {
        return loc.getWorld().getName() + ";" + loc.getX() + ";" + loc.getY() + ";" + loc.getZ() + ";" + loc.getYaw() + ";" + loc.getPitch();
    }
    default Location toLocation(@NotNull String string) {
        final String[] a = string.split(";");
        return new Location(Bukkit.getWorld(a[0]), Double.parseDouble(a[1]), Double.parseDouble(a[2]), Double.parseDouble(a[3]), Float.parseFloat(a[4]), Float.parseFloat(a[5]));
    }

    default long getDelay(@NotNull String input) {
        input = input.toLowerCase();
        long l = 0;
        if(input.contains("d")) {
            final String[] s = input.split("d");
            l += getRemainingDouble(s[0])*1000*60*60*24;
            input = s.length > 1 ? s[1] : input;
        }
        if(input.contains("h")) {
            final String[] s = input.split("h");
            l += getRemainingDouble(s[0])*1000*60*60;
            input = s.length > 1 ? s[1] : input;
        }
        if(input.contains("m")) {
            final String[] s = input.split("m");
            l += getRemainingDouble(s[0])*1000*60;
            input = s.length > 1 ? s[1] : input;
        }
        if(input.contains("s")) {
            l += getRemainingDouble(input.split("s")[0])*1000;
        }
        return l;
    }
    default String getRemainingTime(long time) {
        int sec = (int) TimeUnit.MILLISECONDS.toSeconds(time), min = sec/60, hr = min/60, d = hr/24;
        hr -= d*24;
        min -= (hr*60)+(d*60*24);
        sec -= (min*60)+(hr*60*60)+(d*60*60*24);
        final String dys = d > 0 ? d + "d" + (hr != 0 ? " " : "") : "";
        final String hrs = hr > 0 ? hr + "h" + (min != 0 ? " " : "") : "";
        final String mins = min != 0 ? min + "m" + (sec != 0 ? " " : "") : "";
        final String secs = sec != 0 ? sec + "s" : "";
        return dys + hrs + mins + secs;
    }
    default long getTime(@Nullable String fromString) {
        long time = 0;
        if(fromString != null) {
            fromString = ChatColor.stripColor(fromString);
            if(fromString.contains("d")) {
                time += getRemainingDouble(fromString.split("d")[0])*24*60*60;
                if(fromString.contains("h") || fromString.contains("m") || fromString.contains("s")) fromString = fromString.split("d")[1];
            }
            if(fromString.contains("h")) {
                time += getRemainingDouble(fromString.split("h")[0])*60*60;
                if(fromString.contains("m") || fromString.contains("s")) fromString = fromString.split("h")[1];
            }
            if(fromString.contains("m")) {
                time += getRemainingDouble(fromString.split("m")[0])*60;
                if(fromString.contains("s")) fromString = fromString.split("m")[1];
            }
            if(fromString.contains("s")) {
                time += getRemainingDouble(fromString.split("s")[0]);
                //fromString = fromString.split("s")[0];
            }
        }
        return time*1000;
    }
}
