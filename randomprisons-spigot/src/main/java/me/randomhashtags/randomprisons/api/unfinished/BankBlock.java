package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class BankBlock extends RPFeature {
    private static BankBlock instance;
    public static BankBlock getBankBlock() {
        if(instance == null) instance = new BankBlock();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
