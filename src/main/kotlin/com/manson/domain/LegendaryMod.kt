package com.manson.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder

@JsonIgnoreProperties(ignoreUnknown = true)
class LegendaryMod @JvmOverloads constructor(var value: String? = null, var star: Int = 999, var abbreviation: String? = null) {
    var id: String? = null
    var gameId: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o !is LegendaryMod) {
            return false
        }
        return EqualsBuilder()
                .append(star, o.star)
                .append(value, o.value)
                .append(abbreviation, o.abbreviation)
                .append(id, o.id)
                .isEquals
    }

    override fun hashCode(): Int {
        return HashCodeBuilder(17, 37)
                .append(value)
                .append(star)
                .append(abbreviation)
                .append(id)
                .toHashCode()
    }

    override fun toString(): String {
        return "LegendaryMod(value=$value, star=$star, abbreviation=$abbreviation, id=$id, gameId=$gameId)"
    }
}