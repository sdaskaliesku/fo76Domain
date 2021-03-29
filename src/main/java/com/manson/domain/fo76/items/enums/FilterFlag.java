package com.manson.domain.fo76.items.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public enum FilterFlag {
    POWER_ARMOR("Power Armor", 0L),
    WEAPON_MELEE("Weapon - Melee", true, false),
    WEAPON_RANGED("Weapon - Ranged", true, false),
    WEAPON_THROWN("Weapon - Thrown", false, 2L, 3L),
    WEAPON("Weapon", true, Arrays.asList(WEAPON_THROWN, WEAPON_MELEE, WEAPON_RANGED), RawFilterFlags.FILTER_WEAPONS,
        5L),
    ARMOR("Armor", true, Collections.emptyList(), RawFilterFlags.FILTER_ARMOR),
    APPAREL("Apparel", RawFilterFlags.FILTER_APPAREL),
    FOOD_WATER("Food - Water", RawFilterFlags.FILTER_FOODWATER, 33L, 9L),
    AID("Aid", RawFilterFlags.FILTER_AID, 65L),
    PLANS("Plans", false, false),
    NOTES("Notes", false, Collections.singletonList(PLANS), RawFilterFlags.FILTER_BOOKS, 128L),
    HOLO("Holo", RawFilterFlags.FILTER_HOLOTAPES),
    AMMO("Ammo", RawFilterFlags.FILTER_AMMO),
    MISC("Misc", RawFilterFlags.FILTER_MISC, 266240L, 512L, 33280L),
    MODS("Mods", RawFilterFlags.FILTER_MODS, 2048L),
    JUNK("Junk", RawFilterFlags.FILTER_JUNK, 270336L, 33792L),
    UNKNOWN("Unknown");

    private final List<Long> flags = new ArrayList<>();
    private final String value;
    private final boolean hasStarMods;
    private final List<FilterFlag> subtypes;
    private final boolean parent;

    FilterFlag(String name, boolean hasStarMods, List<FilterFlag> subtypes, boolean parent, Long... flags) {
        this.flags.addAll(Arrays.asList(flags));
        this.value = name;
        this.hasStarMods = hasStarMods;
        this.subtypes = subtypes;
        this.parent = parent;
    }

    FilterFlag(String name, boolean hasStarMods, List<FilterFlag> subtypes, Long... flags) {
        this(name, hasStarMods, subtypes, true, flags);
    }

    FilterFlag(String name, boolean parent, Long... flags) {
        this(name, false, Collections.emptyList(), parent, flags);
    }

    FilterFlag(String name, Long... flags) {
        this(name, false, Collections.emptyList(), true, flags);
    }

    FilterFlag(String name, boolean hasStarMods, boolean parent) {
        this(name, hasStarMods, Collections.emptyList(), parent);
    }

    FilterFlag(String name, boolean hasStarMods) {
        this(name, hasStarMods, Collections.emptyList(), true);
    }

    public static FilterFlag fromInt(Long flag) {
        if (flag == null) {
            return UNKNOWN;
        }
        return Arrays.stream(values())
            .filter(filterFlag -> filterFlag.getFlags().contains(flag)).findFirst().orElse(UNKNOWN);
    }

    public static FilterFlag fromString(String flag) {
        if (StringUtils.isBlank(flag)) {
            return null;
        }
        return Arrays.stream(values())
            .filter(filterFlag -> StringUtils.equalsIgnoreCase(flag, filterFlag.value) || StringUtils
                .equalsIgnoreCase(flag, filterFlag.name())).findFirst().orElse(null);
    }

    public List<Long> getFlags() {
        return flags;
    }

    public String getValue() {
        return value;
    }

    public boolean isHasStarMods() {
        return hasStarMods;
    }

    public List<FilterFlag> getSubtypes() {
        return subtypes;
    }

    public boolean isParent() {
        return parent;
    }
}
