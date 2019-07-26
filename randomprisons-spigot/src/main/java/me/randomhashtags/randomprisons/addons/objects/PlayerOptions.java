package me.randomhashtags.randomprisons.addons.objects;

import me.randomhashtags.randomprisons.addons.enums.PlayerOption;
import me.randomhashtags.randomprisons.utils.objects.DiObject;

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
