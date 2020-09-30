package com.manson.domain.nuka

import com.fasterxml.jackson.annotation.JsonProperty

open class NukaRow {

    @JsonProperty("EDID")
    var edid: String? = ""

    @JsonProperty("Name")
    var name: String? = ""
    @JsonProperty("formID")
    var formId: String? = ""
    var formType: String? = ""
}