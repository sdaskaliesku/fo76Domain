package com.manson.domain.itemextractor

import com.fasterxml.jackson.annotation.JsonProperty
import com.manson.AbstractObject
import com.manson.domain.fo76.AccountInfoData
import com.manson.domain.fo76.CharacterInfoData
import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle

open class CharacterInventory : AbstractObject() {
    var playerInventory: MutableList<ItemDescriptor> = ArrayList()
    var stashInventory: MutableList<ItemDescriptor> = ArrayList()

    @JsonProperty("AccountInfoData")
    var accountInfoData: AccountInfoData = AccountInfoData()

    @JsonProperty("CharacterInfoData")
    var characterInfoData: CharacterInfoData = CharacterInfoData()
    override fun toString(): String {
        return ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
            .append("playerInventory", playerInventory)
            .append("stashInventory", stashInventory)
            .append("accountInfoData", accountInfoData)
            .append("characterInfoData", characterInfoData)
            .toString()
    }
}