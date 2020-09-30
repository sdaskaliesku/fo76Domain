package com.manson.domain.fed76

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.manson.domain.fo76.items.enums.ArmorGrade

@JsonIgnoreProperties(ignoreUnknown = true)
open class Fed76ItemDetails {
    var name: String = ""
    var fedName: String = ""
    var formId: String = ""
    var abbreviation: String = ""
    var armorGrade: ArmorGrade = ArmorGrade.Unknown
}