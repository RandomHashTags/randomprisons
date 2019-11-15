package me.randomhashtags.randomprisons.util;

import me.randomhashtags.randomprisons.addon.KillTag;
import me.randomhashtags.randomprisons.addon.PlayerAttribute;
import me.randomhashtags.randomprisons.util.universal.UVersion;

import java.util.HashMap;

public abstract class RPStorage extends UVersion {
    protected static HashMap<String, KillTag> killtags;
    protected static HashMap<String, PlayerAttribute> playerattributes;

    public KillTag getKillTag(String identifier) {
        return killtags != null ? killtags.getOrDefault(identifier, null) : null;
    }
    public void addKillTag(KillTag tag) {
        if(killtags == null) killtags = new HashMap<>();
        killtags.put(tag.getIdentifier(), tag);
    }

    public PlayerAttribute getPlayerAttribute(String identifier) {
        return playerattributes != null ? playerattributes.getOrDefault(identifier, null) : null;
    }
    public void addPlayerAttribute(PlayerAttribute attribute) {
        if(playerattributes == null) playerattributes = new HashMap<>();
        playerattributes.put(attribute.getIdentifier(), attribute);
    }
}
