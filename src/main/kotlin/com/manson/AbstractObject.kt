package com.manson

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter

open class AbstractObject {
    protected var unknownFields: MutableMap<String, Any> = HashMap()

    @JsonAnyGetter
    fun getUnknownFieldsMap(): MutableMap<String, Any> {
        return unknownFields
    }

    @JsonAnySetter
    fun setUnknownField(key: String, value: Any) {
        unknownFields[key] = value
    }



    override fun toString(): String {
        return "AbstractObject(unknownFields=$unknownFields)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AbstractObject) return false

        if (unknownFields != other.unknownFields) return false

        return true
    }

    override fun hashCode(): Int {
        return unknownFields.hashCode()
    }


}