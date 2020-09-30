package com.manson.domain.itemextractor

import com.manson.AbstractObject
import org.apache.commons.collections4.MapUtils
import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle
import java.util.Date
import kotlin.collections.HashMap

open class ModData : AbstractObject() {
    var version: Double = 0.0
    var dumpDate: Date = Date()
    var characterInventories: MutableMap<String, CharacterInventory> = HashMap()

    fun isEmpty(): Boolean {
        return MapUtils.isEmpty(characterInventories)
    }

    override fun toString(): String {
        return ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
            .append("characterInventories", characterInventories)
            .toString()
    }
}