package com.manson.domain.fed76.pricing

import com.manson.domain.fo76.items.enums.ArmorGrade
import org.apache.commons.lang3.StringUtils

open class PriceCheckRequest {

    var name: String = ""
    var abbreviation: String = ""
    var armorGrade: ArmorGrade = ArmorGrade.Unknown

    fun isValid(): Boolean {
        return StringUtils.isNoneBlank(name, abbreviation)
    }

    fun toId(): String {
        return "$name/$abbreviation/$armorGrade"
    }

    override fun toString(): String {
        return "PriceCheckRequest(name='$name', abbreviation='$abbreviation', armorGrade=$armorGrade)"
    }


}