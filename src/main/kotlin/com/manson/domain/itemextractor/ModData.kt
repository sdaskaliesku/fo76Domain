package com.manson.domain.itemextractor

import com.manson.AbstractObject
import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle

open class ModData : AbstractObject() {
    var user: ModUser? = ModUser()
    var characterInventories: Map<String, CharacterInventory> = HashMap()
    override fun toString(): String {
        return ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
            .append("characterInventories", characterInventories)
            .append("user", user)
            .toString()
    }
}