package com.manson.domain.fed76

import com.manson.domain.itemextractor.ItemDescriptor

open class FedModDataRequest {
    var version: Double = 0.0
    var characterInventories: MutableMap<String, MutableList<ItemDescriptor>> = HashMap()
}