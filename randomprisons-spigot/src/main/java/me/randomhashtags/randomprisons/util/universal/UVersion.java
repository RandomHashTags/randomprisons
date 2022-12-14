package me.randomhashtags.randomprisons.util.universal;

import me.randomhashtags.randomprisons.RandomPrisons;
import me.randomhashtags.randomprisons.util.supported.SpawnerAPI;
import org.bukkit.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class UVersion implements UVersionable {
    private static UVersion instance;
    public static UVersion getUVersion() {
        if(instance == null) instance = new UVersion();
        return instance;
    }

    public final RandomPrisons randomprisons = RandomPrisons.getPlugin;
    public final PluginManager pluginmanager = Bukkit.getPluginManager();
    public final Random random = new Random();

    public final String version = Bukkit.getVersion();
    public final BukkitScheduler scheduler = Bukkit.getScheduler();
    public final ConsoleCommandSender console = Bukkit.getConsoleSender();
    public ItemStack item = new ItemStack(Material.APPLE);
    public ItemMeta itemMeta = item.getItemMeta();
    public List<String> lore = new ArrayList<>();

    public void save(String folder, String file) {
        File f = null;
        final File d = randomprisons.getDataFolder();
        if(folder != null && !folder.equals(""))
            f = new File(d + File.separator + folder + File.separator, file);
        else
            f = new File(d + File.separator, file);
        if(!f.exists()) {
            f.getParentFile().mkdirs();
            randomprisons.saveResource(folder != null && !folder.equals("") ? folder + File.separator + file : file, false);
        }
    }
    public String formatBigDecimal(BigDecimal b) {
        return formatBigDecimal(b, false);
    }
    public String formatBigDecimal(BigDecimal b, boolean currency) {
        return (currency ? NumberFormat.getCurrencyInstance() : NumberFormat.getInstance()).format(b);
    }
    public BigDecimal getBigDecimal(String value) {
        return BigDecimal.valueOf(Double.parseDouble(value));
    }
    public String formatDouble(double d) {
        String decimals = Double.toString(d).split("\\.")[1];
        if(decimals.equals("0")) { decimals = ""; } else { decimals = "." + decimals; }
        return formatInt((int) d) + decimals;
    }
    public String formatLong(long l) {
        final String f = Long.toString(l);
        final boolean c = f.contains(".");
        String decimals = c ? f.split("\\.")[1] : f;
        decimals = c ? decimals.equals("0") ? "" : "." + decimals : "";
        return formatInt((int) l) + decimals;
    }
    public String formatInt(int integer) { return String.format("%,d", integer); }
    public int getRemainingInt(String string) {
        string = ChatColor.stripColor(ChatColor.translateAlternateColorCodes('&', string)).replaceAll("\\p{L}", "").replaceAll("\\s", "").replaceAll("\\p{P}", "").replaceAll("\\p{S}", "");
        return string == null || string.equals("") ? -1 : Integer.parseInt(string);
    }
    public void spawnFirework(Firework firework, Location loc) {
        if(firework != null) {
            final Firework fw = loc.getWorld().spawn(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY(), loc.getZ()+0.5), Firework.class);
            fw.setFireworkMeta(firework.getFireworkMeta());
        }
    }
    public Firework createFirework(FireworkEffect.Type explosionType, Color trailColor, Color explodeColor, int power) {
        final World w = Bukkit.getWorlds().get(0);
        final Firework fw = w.spawn(w.getSpawnLocation(), Firework.class);
        final FireworkMeta fwm = fw.getFireworkMeta();
        fwm.setPower(power);
        fwm.addEffect(FireworkEffect.builder().trail(true).flicker(true).with(explosionType).withColor(trailColor).withFade(explodeColor).withFlicker().withTrail().build());
        fw.setFireworkMeta(fwm);
        return fw;
    }
    public Double getRemainingDouble(String string) {
        string = ChatColor.stripColor(ChatColor.translateAlternateColorCodes('&', string).replaceAll("\\p{L}", "").replaceAll("\\p{Z}", "").replaceAll("\\.", "d").replaceAll("\\p{P}", "").replaceAll("\\p{S}", "").replace("d", "."));
        return string == null || string.equals("") ? -1.00 : Double.parseDouble(string.contains(".") && string.split("\\.").length > 1 && string.split("\\.")[1].length() > 2 ? string.substring(0, string.split("\\.")[0].length() + 3) : string);
    }
    public String toMaterial(String input, boolean realitem) {
        if(input.contains(":")) input = input.split(":")[0];
        if(input.contains(" ")) input = input.replace(" ", "");
        if(input.contains("_")) input = input.replace("_", " ");
        String e = "";
        if(input.contains(" ")) {
            for(int i = 0; i < input.split(" ").length; i++) {
                e = e + input.split(" ")[i].substring(0, 1).toUpperCase() + input.split(" ")[i].substring(1).toLowerCase() + (i != input.split(" ").length - 1 ? (realitem ? "_" : " ") : "");
            }
        } else e = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        return e;
    }
    public String getRemainingTime(long time) {
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
    public long getTime(String fromString) {
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
    public Enchantment getEnchantment(String string) {
        if(string != null) {
            for(Enchantment enchant : Enchantment.values())
                if(enchant != null && enchant.getName() != null && string.toLowerCase().replace("_", "").startsWith(enchant.getName().toLowerCase().replace("_", ""))) return enchant;
            string = string.toLowerCase().replace("_", "");
            if(string.startsWith("po")) { return Enchantment.ARROW_DAMAGE; // Power
            } else if(string.startsWith("fl")) { return Enchantment.ARROW_FIRE; // Flame
            } else if(string.startsWith("i")) { return Enchantment.ARROW_INFINITE; // Infinity
            } else if(string.startsWith("pu")) { return Enchantment.ARROW_KNOCKBACK; // Punch
            } else if(string.startsWith("bi") && !version.contains("1.8") && !version.contains("1.9") && !version.contains("1.10")) { return Enchantment.getByName("BINDING_CURSE"); // Binding Curse
            } else if(string.startsWith("sh")) { return Enchantment.DAMAGE_ALL; // Sharpness
            } else if(string.startsWith("ba")) { return Enchantment.DAMAGE_ARTHROPODS; // Bane of Arthropods
            } else if(string.startsWith("sm")) { return Enchantment.DAMAGE_UNDEAD; // Smite
            } else if(string.startsWith("de")) { return Enchantment.DEPTH_STRIDER; // Depth Strider
            } else if(string.startsWith("e")) { return Enchantment.DIG_SPEED; // Efficiency
            } else if(string.startsWith("u")) { return Enchantment.DURABILITY; // Unbreaking
            } else if(string.startsWith("firea")) { return Enchantment.FIRE_ASPECT; // Fire Aspect
            } else if(string.startsWith("fr") && !version.contains("1.8")) { return Enchantment.getByName("FROST_WALKER"); // Frost Walker
            } else if(string.startsWith("k")) { return Enchantment.KNOCKBACK; // Knockback
            } else if(string.startsWith("fo")) { return Enchantment.LOOT_BONUS_BLOCKS; // Fortune
            } else if(string.startsWith("lo")) { return Enchantment.LOOT_BONUS_MOBS; // Looting
            } else if(string.startsWith("luc")) { return Enchantment.LUCK; // Luck
            } else if(string.startsWith("lur")) { return Enchantment.LURE; // Lure
            } else if(string.startsWith("m") && !version.contains("1.8")) { return Enchantment.getByName("MENDING"); // Mending
            } else if(string.startsWith("r")) { return Enchantment.OXYGEN; // Respiration
            } else if(string.startsWith("prot")) { return Enchantment.PROTECTION_ENVIRONMENTAL; // Protection
            } else if(string.startsWith("bl") || string.startsWith("bp")) { return Enchantment.PROTECTION_EXPLOSIONS; // Blast Protection
            } else if(string.startsWith("ff") || string.startsWith("fe")) { return Enchantment.PROTECTION_FALL; // Feather Falling
            } else if(string.startsWith("fp") || string.startsWith("firep")) { return Enchantment.PROTECTION_FIRE; // Fire Protection
            } else if(string.startsWith("pp") || string.startsWith("proj")) { return Enchantment.PROTECTION_PROJECTILE; // Projectile Protection
            } else if(string.startsWith("si")) { return Enchantment.SILK_TOUCH; // Silk Touch
            } else if(string.startsWith("th")) { return Enchantment.THORNS; // Thorns
            } else if(string.startsWith("v") && !version.contains("1.8") && !version.contains("1.9") && !version.contains("1.10")) { return Enchantment.getByName("VANISHING_CURSE"); // Vanishing Curse
            } else if(string.startsWith("aa") || string.startsWith("aq")) { return Enchantment.WATER_WORKER; // Aqua Affinity
            } else { return null; }
        }
        return null;
    }
    // From http://www.baeldung.com/java-round-decimal-number
    public double round(double input, int decimals) {
        if(decimals < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(input));
        bd = bd.setScale(decimals, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public String roundDoubleString(double input, int decimals) {
        final double d = round(input, decimals);
        return Double.toString(d);
    }

    public int indexOf(Set<? extends Object> collection, Object value) {
        int i = 0;
        for(Object o : collection) {
            if(value.equals(o)) return i;
            i++;
        }
        return -1;
    }
    public int indexOf(Collection<? extends Object> collection, Object value) {
        int i = 0;
        for(Object o : collection) {
            if(value.equals(o)) return i;
            i++;
        }
        return -1;
    }
    /*
     * Credit to "Sahil Mathoo" from StackOverFlow at
     * https://stackoverflow.com/questions/8154366/how-to-center-a-string-using-string-format
     */
    public String center(String s, int size) {
        return center(s, size, ' ');
    }
    private String center(String s, int size, char pad) {
        if(s == null || size <= s.length())
            return s;
        StringBuilder sb = new StringBuilder(size);
        for(int i = 0; i < (size - s.length()) / 2; i++)  sb.append(pad);
        sb.append(s);
        while(sb.length() < size) sb.append(pad);
        return sb.toString();
    }

    public void giveItem(Player player, ItemStack is) {
        if(is == null || is.getType().equals(Material.AIR)) return;
        final UMaterial m = UMaterial.match(is);
        final ItemMeta meta = is.getItemMeta();
        final PlayerInventory i = player.getInventory();
        final int f = i.first(is.getType()), e = i.firstEmpty(), max = is.getMaxStackSize();
        int amountLeft = is.getAmount();

        if(f != -1) {
            for(int s = 0; s < i.getSize(); s++) {
                final ItemStack t = i.getItem(s);
                if(amountLeft > 0 && t != null && t.getItemMeta().equals(meta) && UMaterial.match(t) == m) {
                    final int a = t.getAmount(), toMax = max-a, given = amountLeft <= toMax ? amountLeft : toMax;
                    if(given > 0) {
                        t.setAmount(a+given);
                        amountLeft -= given;
                    }
                }
            }
            player.updateInventory();
        }
        if(amountLeft > 0) {
            is.setAmount(amountLeft);
            if(e >= 0) {
                i.addItem(is);
                player.updateInventory();
            } else {
                player.getWorld().dropItem(player.getLocation(), is);
            }
        }
    }
    public void removeItem(Player player, ItemStack itemstack, int amount) {
        final PlayerInventory inv = player.getInventory();
        int nextslot = getNextSlot(player, itemstack);
        for(int i = 1; i <= amount; i++) {
            if(nextslot >= 0) {
                final ItemStack is = inv.getItem(nextslot);
                if(is.getAmount() == 1) {
                    inv.setItem(nextslot, new ItemStack(Material.AIR));
                    nextslot = getNextSlot(player, itemstack);
                } else {
                    is.setAmount(is.getAmount() - 1);
                }
            }
        }
        player.updateInventory();
    }
    private int getNextSlot(Player player, ItemStack itemstack) {
        final PlayerInventory inv = player.getInventory();
        for(int i = 0; i < inv.getSize(); i++) {
            item = inv.getItem(i);
            if(item != null && item.getData().getData() == itemstack.getData().getData() && item.getType().equals(itemstack.getType())
                    && item.getItemMeta().equals(itemstack.getItemMeta())) {
                return i;
            }
        }
        return -1;
    }
    public int getTotalAmount(Inventory inventory, UMaterial umat) {
        final ItemStack i = umat.getItemStack();
        int amount = 0;
        for(ItemStack is : inventory.getContents()) {
            if(is != null && is.isSimilar(i)) {
                amount += is.getAmount();
            }
        }
        return amount;
    }
    public ItemStack getSpawner(String input) {
        String pi = input.toLowerCase(), type = null;
        if(pi.equals("mysterymobspawner")) {
            return givedpitem.valueOf("mysterymobspawner").clone();
        } else {
            final Plugin plugin = RandomPrisons.spawnerPlugin;
            if(plugin != null) {
                for(EntityType entitytype : EntityType.values()) {
                    final String s = entitytype.name().toLowerCase().replace("_", "");
                    if(pi.startsWith(s + "spawner")) {
                        type = s;
                    }
                }
                if(type == null) {
                    if(pi.contains("pig") && pi.contains("zombie")) type = "pigzombie";
                }
                if(type == null) return null;
                final ItemStack is = SpawnerAPI.getSpawnerAPI().getItem(type);
                if(is != null) {
                    return is;
                } else {
                    console.sendMessage("[RandomPrisons] SilkSpawners or EpicSpawners is required to use this feature!");
                }
            }
        }

        return null;
    }
    public LivingEntity getHitEntity(ProjectileHitEvent event) {
        final List<Entity> n = event.getEntity().getNearbyEntities(0.0, 0.0, 0.0);
        return n.size() > 0 && n.get(0) instanceof LivingEntity ? (LivingEntity) n.get(0) : null;
    }
    public void playParticle(FileConfiguration config, String path, Location location, int count) {
        if(config != null && config.get(path) != null) {
            final String target = config.getString(path);
            final UParticle up = UParticle.matchParticle(target.toUpperCase());
            if(up != null) up.play(location, count);
        }
    }
    public void playSound(FileConfiguration config, String path, Player player, Location location, boolean globalsound) {
		if(config.get(path) != null) {
		    final String[] p = config.getString(path).split(":");
			final String s = p[0].toUpperCase();
			final int v = Integer.parseInt(p[1]), pp = Integer.parseInt(p[2]);
			try {
			    final Sound sound = Sound.valueOf(s);
                if(player != null) {
                    if(!globalsound) player.playSound(location, sound, v, pp);
                    else             player.getWorld().playSound(location, sound, v, pp);
                } else {
                    location.getWorld().playSound(location, sound, v, pp);
                }
            } catch (Exception e) {
			    sendConsoleMessage("&6[RandomPrisons] &cERROR! Invalid sound name: &f" + s + "&c!");
            }
		}
    }
    public void playSound(String sound, int pitch, int volume, Object loc, int playTimes, boolean globalsound) {
        return;
		/*Sound s = Sound.getHome(sound.toUpperCase());
		if(s == null) {
			Bukkit.broadcastMessage("[RandomPrisons] Invalid sound name! \"" + sound.toUpperCase() + "\"");
			return;
		}
		for(int i = 1; i <= playTimes; i++) {
			if(globalsound) {
				if(loc instanceof Location) ((Location) loc).getWorld().playSound((Location) loc, s, volume, pitch);
				else if(loc instanceof Entity) ((Entity) loc).getWorld().playSound(((Player) loc).getLocation(), s, volume, pitch);
			} else if(loc instanceof Player)
				((Player) loc).playSound(((Player) loc).getLocation(), s, pitch, volume);
		}*/
    }
    public PotionEffect getPotionEffect(LivingEntity entity, PotionEffectType type) {
        if(version.contains("1.8")) {
            for(PotionEffect e : entity.getActivePotionEffects())
                if(e.getType().equals(type))
                    return e;
            return null;
        } else {
            return entity.getPotionEffect(type);
        }
    }
    public List<Location> getChunkLocations(Chunk chunk) {
        final List<Location> l = new ArrayList<>();
        final int x = chunk.getX()*16, z = chunk.getZ()*16;
        final World world = chunk.getWorld();
        for(int xx = x; xx < x+16; xx++)
            for(int zz = z; zz < z+16; zz++)
                l.add(new Location(world, xx, 0, zz));
        return l;
    }
    public Entity getEntity(UUID uuid) {
        if(uuid != null) {
            if(version.contains("1.8") || version.contains("1.9")) {
                for(World w : Bukkit.getWorlds())
                    for(LivingEntity le : w.getLivingEntities())
                        if(uuid.equals(le.getUniqueId())) return le;
            } else {
                return Bukkit.getEntity(uuid);
            }
        }
        return null;
    }
    public LivingEntity getEntity(String type, Location l, boolean spawn) {
        final boolean baby = type.contains(":") && type.toLowerCase().endsWith(":true");
        type = type.toUpperCase().split(":")[0];
        LivingEntity mob = null;
        final World w = l.getWorld();
        if(type.equals("BAT"))              mob = w.spawn(l, Bat.class);
        else if(type.equals("BLAZE"))       mob = w.spawn(l, Blaze.class);
        else if(type.equals("CAVE_SPIDER")) mob = w.spawn(l, CaveSpider.class);
        else if(type.equals("CHICKEN"))     mob = w.spawn(l, Chicken.class);
        else if(type.equals("COW"))         mob = w.spawn(l, Cow.class);
        else if(type.equals("CREEPER"))     mob = w.spawn(l, Creeper.class);
        else if(type.equals("ENDER_DRAGON"))mob = w.spawn(l, EnderDragon.class);
        else if(type.equals("ENDERMAN"))    mob = w.spawn(l, Enderman.class);
        else if(type.equals("ENDERMITE"))   mob = w.spawn(l, Endermite.class);
        else if(type.equals("GHAST"))       mob = w.spawn(l, Ghast.class);
        else if(type.equals("GIANT"))       mob = w.spawn(l, Giant.class);
        else if(type.equals("GUARDIAN"))    mob = w.spawn(l, Guardian.class);
        else if(type.equals("HORSE"))       mob = w.spawn(l, Horse.class);
        else if(type.equals("IRON_GOLEM"))  mob = w.spawn(l, IronGolem.class);
        else if(type.equals("LLAMA") && !version.contains("1.8") && !version.contains("1.9") && !version.contains("1.10"))
            mob = w.spawn(l, Llama.class);
        else if(type.equals("MAGMA_CUBE"))  mob = w.spawn(l, MagmaCube.class);
        else if(type.equals("MUSHROOM_COW"))mob = w.spawn(l, MushroomCow.class);
        else if(type.equals("OCELOT"))      mob = w.spawn(l, Ocelot.class);
        else if(type.equals("PARROT") && !version.contains("1.8") && !version.contains("1.9") && !version.contains("1.10") && !version.contains("1.11"))
            mob = w.spawn(l, Parrot.class);
        else if(type.equals("PIG"))         mob = w.spawn(l, Pig.class);
        else if(type.equals("PIG_ZOMBIE")) {
            mob = w.spawn(l, PigZombie.class);
            ((PigZombie) mob).setBaby(baby);
        } else if(type.equals("RABBIT"))    mob = w.spawn(l, Rabbit.class);
        else if(type.equals("SHEEP"))       mob = w.spawn(l, Sheep.class);
        else if(type.equals("SHULKER") && !version.contains("1.8"))
            mob = w.spawn(l, Shulker.class);
        else if(type.equals("SILVERFISH"))  mob = w.spawn(l, Silverfish.class);
        else if(type.equals("SKELETON"))    mob = w.spawn(l, Skeleton.class);
        else if(type.equals("SLIME"))       mob = w.spawn(l, Slime.class);
        else if(type.equals("SNOWMAN"))     mob = w.spawn(l, Snowman.class);
        else if(type.equals("SQUID"))       mob = w.spawn(l, Squid.class);
        else if(type.equals("SPIDER"))      mob = w.spawn(l, Spider.class);
        else if(type.equals("STRAY") && !version.contains("1.8") && !version.contains("1.9"))
            mob = w.spawn(l, Stray.class);
        else if(type.equals("VEX") && !version.contains("1.8") && !version.contains("1.9") && !version.contains("1.10"))
            mob = w.spawn(l, Vex.class);
        else if(type.equals("VILLAGER"))    mob = w.spawn(l, Villager.class);
        else if(type.equals("VINDICATOR") && !version.contains("1.8") && !version.contains("1.9") && !version.contains("1.10"))
            mob = w.spawn(l, Vindicator.class);
        else if(type.equals("WITCH"))       mob = w.spawn(l, Witch.class);
        else if(type.equals("WITHER"))      mob = w.spawn(l, Wither.class);
        else if(type.equals("WITHER_SKELETON")) {
            if(version.contains("1.8") || version.contains("1.9") || version.contains("1.10")) {
                mob = w.spawn(l, Skeleton.class);
                ((Skeleton) mob).setSkeletonType(Skeleton.SkeletonType.WITHER);
            } else {
                mob = w.spawn(l, WitherSkeleton.class);
            }
        } else if(type.equals("ZOMBIE"))    mob = w.spawn(l, Zombie.class);
        else if(type.equals("ZOMBIE_HORSE") && !version.contains("1.8"))
            mob = w.spawn(l, ZombieHorse.class);
        else if(type.equals("ZOMBIE_VILLAGER") && !version.contains("1.8"))
            mob = w.spawn(l, ZombieVillager.class);
        else return null;
        if(!spawn) {
            mob.remove();
        } else if(mob instanceof Ageable) {
            final Ageable a = (Ageable) mob;
            a.setBaby();
            a.setAgeLock(true);
        }
        return mob;
    }
}
