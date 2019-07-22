package me.randomhashtags.randomprisons.api.unfinished;

import me.randomhashtags.randomprisons.utils.RPFeature;

public class AuctionHouse extends RPFeature {
    private static AuctionHouse instance;
    public static AuctionHouse geAuctionHouse() {
        if(instance == null) instance = new AuctionHouse();
        return instance;
    }

    public void load() {
    }
    public void unload() {
    }
}
