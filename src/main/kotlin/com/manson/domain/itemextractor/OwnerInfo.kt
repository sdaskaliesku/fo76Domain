package com.manson.domain.itemextractor

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.manson.AbstractObject
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder

@JsonIgnoreProperties(ignoreUnknown = true)
open class OwnerInfo : AbstractObject() {
    var id: String? = null
    var name: String? = null
    var accountOwner: String? = null
    var characterOwner: String? = null
    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o !is OwnerInfo) {
            return false
        }
        return EqualsBuilder()
            .append(id, o.id)
            .append(name, o.name)
            .append(accountOwner, o.accountOwner)
            .append(characterOwner, o.characterOwner)
            .isEquals
    }

    override fun hashCode(): Int {
        return HashCodeBuilder(17, 37)
            .append(id)
            .append(name)
            .append(accountOwner)
            .append(characterOwner)
            .toHashCode()
    }
}