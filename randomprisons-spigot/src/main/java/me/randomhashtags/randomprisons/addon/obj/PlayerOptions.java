package me.randomhashtags.randomprisons.addon.obj;

import me.randomhashtags.randomprisons.addon.PlayerOption;
import me.randomhashtags.randomprisons.util.obj.DiObject;

import java.util.LinkedHashMap;

public class PlayerOptions {
    private LinkedHashMap<PlayerOption, DiObject> options;
    public PlayerOptions() {
        final LinkedHashMap<PlayerOption, DiObject> deFault = new LinkedHashMap<>();
        options = deFault;
    }
    public PlayerOptions(LinkedHashMap<PlayerOption, DiObject> options) {
        this.options = options;
    }
    public void setOption(PlayerOption option, DiObject value) {
        options.put(option, value);
    }
}
