package com.manson.domain.fo76.items

import com.fasterxml.jackson.annotation.JsonProperty
import com.manson.AbstractObject

open class InventoryListWrapper : AbstractObject() {
    @JsonProperty("InventoryList")
    var inventoryList: MutableList<ItemDescriptor> = ArrayList()
}