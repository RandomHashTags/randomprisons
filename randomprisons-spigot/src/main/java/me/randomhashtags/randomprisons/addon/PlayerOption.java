package me.randomhashtags.randomprisons.addon;

public enum PlayerOption {
    TRADE_REQUESTS,
    LEVEL_UP_ALERTS,
    EXTRACT_XP_CONFIRMATION,
    MINING_CRITICALS,
    ORE_DROP_ANIMATION,
    COIN_FLIP_MESSAGES,
    JACKPOT_MESSAGES,
    HIDE_DANGLES,
    KILL_MESSAGE_STEALTH,
    KILL_MESSAGE_VISIBLITY,
    SPAWN_DEATH_MESSAGES,
    DEATH_MESSAGE_RADIUS,
    ENCHANT_PLAYER_VISIBILITY,
    GANG_REQUESTS,
    MERCHANT_ALERTS,
    BANDIT_ALERTS,
    ALIEN_ALERTS,
    CELL_PARTICLES,
    ITEM_FILTER_TOGGLE,
    SELF_HELP,
    XP_DING,
    XP_ALERTS,
    DO_NOT_DISTURB,
    CENSOR_BAD_WORDS,
    TRUCE_CHAT,
    GLOBAL_CHAT,
    RANK_KIT_WEAPON_PREFERENCES,
    RANK_KIT_GEAR_PREFERENCES,
    GKIT_PICKAXE_PREFERENCES,
    GKIT_WEAPON_PREFERENCES,
    GKT_GEAR_PREFERENCES,
    ENCHANT_ANIMATION,
    TPA_MODE,
    TPAHERE_MODE;
    private Object[] options;
    PlayerOption(Object...options) {
        this.options = options;
    }
    public Object[] getOptions() { return options; }
}
