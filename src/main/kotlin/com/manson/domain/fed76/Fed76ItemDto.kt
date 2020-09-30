package com.manson.domain.fed76

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.manson.domain.LegendaryMod
import com.manson.domain.fo76.items.enums.FilterFlag

@JsonIgnoreProperties(ignoreUnknown = true)
open class Fed76ItemDto {
    var tradeOptions: Fed76TradeOptions = Fed76TradeOptions()
    var itemDetails: Fed76ItemDetails = Fed76ItemDetails()
    var text: String? = null
    var filterFlag: FilterFlag = FilterFlag.UNKNOWN
    var itemLevel: Int = 0
    var numLegendaryStars: Int = 0
    var isTradable: Boolean = false
    var isLegendary: Boolean = false
    var legendaryMods: MutableList<LegendaryMod> = ArrayList()
}