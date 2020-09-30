package com.manson.domain.config

import com.manson.domain.fo76.items.enums.ArmorGrade

open class ArmorConfig {
    var helper: String = ""
    var dr = 0
    var er = 0
    var rr = 0
    var shortTerm: String = ""
    var armorType: String = ""
    var armorPart: String = ""
    var armorGrade: ArmorGrade = ArmorGrade.Unknown
    var armorId: String = ""
    var gradeId: String = ""
}