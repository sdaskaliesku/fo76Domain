package com.manson.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder

@JsonIgnoreProperties(ignoreUnknown = true)
class LegendaryMod @JvmOverloads constructor(
    var value: String = "",
    var star: Int = 999,
    var abbreviation: String = ""
) {
    var id: String = ""
    var gameId: String = ""
    var text: String = ""


    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is LegendaryMod) {
            return false
        }
        return EqualsBuilder()
                .append(star, other.star)
                .append(value, other.value)
                .append(text, other.text)
                .append(abbreviation, other.abbreviation)
                .append(id, other.id)
                .isEquals
    }

    override fun hashCode(): Int {
        return HashCodeBuilder(17, 37)
            .append(value)
            .append(text)
            .append(star)
            .append(abbreviation)
            .append(id)
            .toHashCode()
    }

    override fun toString(): String {
        return "LegendaryMod(value=$value, star=$star, abbreviation=$abbreviation, id=$id, gameId=$gameId, text=$text)"
    }


}