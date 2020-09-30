package com.manson.domain.fo76.items.enums

import java.util.Objects
import java.util.Arrays

enum class DamageType(val flag: Int, val value: String) {
    NOTHING(0, "Nothing"),
    BALLISTIC(1, "Ballistic"),
    WATER(2, "Water"),
    FLAG_3(3, ""),
    ENERGY(4, "Energy"),
    FLAG_5(5, ""),
    RADIATION(6, "Radiation"),
    AMMO(10, "Ammo"),
    UNKNOWN(-1, "Unknown");

    override fun toString(): String {
        return value
    }

    companion object {
        @JvmStatic
        fun fromDamageType(dmgType: Int): DamageType {
            return if (Objects.isNull(dmgType)) {
                UNKNOWN
            } else Arrays.stream(values()).filter { damageType: DamageType -> damageType.flag == dmgType }
                    .findFirst().orElse(UNKNOWN)
        }
    }
}