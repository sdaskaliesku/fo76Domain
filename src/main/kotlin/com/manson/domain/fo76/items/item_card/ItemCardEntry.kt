package com.manson.domain.fo76.items.item_card

import com.fasterxml.jackson.annotation.JsonIgnore
import com.manson.AbstractObject
import com.manson.domain.fo76.items.enums.DamageType
import com.manson.domain.fo76.items.enums.DamageType.Companion.fromDamageType

open class ItemCardEntry : AbstractObject() {
    var text: String? = null
    var value: String? = null
    var damageType: Int = -1
    var difference: Int? = null
    var diffRating: Int? = null
    var precision: Int? = null
    var duration: Int? = null
    var showAsDescription: Boolean? = null
    var components: MutableList<ItemCardEntryComponent> = ArrayList()

    @get:JsonIgnore
    val damageTypeEnum: DamageType
        get() = fromDamageType(damageType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ItemCardEntry) return false
        if (!super.equals(other)) return false

        if (text != other.text) return false
        if (value != other.value) return false
        if (damageType != other.damageType) return false
        if (difference != other.difference) return false
        if (diffRating != other.diffRating) return false
        if (precision != other.precision) return false
        if (duration != other.duration) return false
        if (showAsDescription != other.showAsDescription) return false
        if (components != other.components) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (text?.hashCode() ?: 0)
        result = 31 * result + (value?.hashCode() ?: 0)
        result = 31 * result + damageType
        result = 31 * result + (difference ?: 0)
        result = 31 * result + (diffRating ?: 0)
        result = 31 * result + (precision ?: 0)
        result = 31 * result + (duration ?: 0)
        result = 31 * result + (showAsDescription?.hashCode() ?: 0)
        result = 31 * result + components.hashCode()
        return result
    }

    override fun toString(): String {
        return "ItemCardEntry(text=$text, value=$value, damageType=$damageType, difference=$difference, diffRating=$diffRating, precision=$precision, duration=$duration, showAsDescription=$showAsDescription, components=$components)"
    }


}