package com.manson.domain.fed76

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
open class Fed76TradeOptions {
    var gamePrice: Double? = null
    var vendorPrice: Double? = null
}