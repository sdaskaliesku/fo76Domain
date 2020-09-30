package com.manson.domain.fed76

import com.manson.domain.fo76.items.enums.FilterFlag

open class FedItemConfig {
    var type: FilterFlag = FilterFlag.UNKNOWN
    var text: String = ""
    var abbreviation: String = ""
}