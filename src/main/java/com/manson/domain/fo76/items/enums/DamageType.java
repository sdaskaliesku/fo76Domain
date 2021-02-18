package com.manson.domain.fo76.items.enums;

import java.util.Arrays;
import java.util.Objects;

public enum DamageType {
    NOTHING(0, "Nothing"),
    BALLISTIC(1, "Ballistic"),
    WATER(2, "Water"),
    FLAG_3(3, ""),
    ENERGY(4, "Energy"),
    FLAG_5(5, ""),
    RADIATION(6, "Radiation"),
    AMMO(10, "Ammo"),
    UNKNOWN(-1, "Unknown");

    private final int flag;
    private final String value;

    DamageType(int flag, String value) {
        this.flag = flag;
        this.value = value;
    }

    public static DamageType fromDamageType(Integer dmgType) {
        if (Objects.isNull(dmgType)) {
            return DamageType.UNKNOWN;
        }
        return Arrays.stream(DamageType.values())
                .filter(x -> x.flag == dmgType)
                .findFirst()
                .orElse(UNKNOWN);
    }

    public int getFlag() {
        return flag;
    }

    public String getValue() {
        return value;
    }
}
