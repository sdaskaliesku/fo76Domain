package com.manson.domain.fed76.mapping

import com.fasterxml.jackson.annotation.JsonProperty

open class Fed76ApiMapping {
    @JsonProperty("by_id")
    var byId: MutableMap<String, Fed76ApiMappingEntry> = HashMap()

    @JsonProperty("by_name")
    var byName: MutableMap<String, Fed76ApiMappingEntry> = HashMap()
}