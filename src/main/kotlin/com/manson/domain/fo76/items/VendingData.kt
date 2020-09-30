package com.manson.domain.fo76.items

import com.manson.AbstractObject

open class VendingData : AbstractObject() {
    var vendedOnOtherMachine: Boolean? = null
    var price: Int? = null
    var machineType: Int? = null



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VendingData) return false
        if (!super.equals(other)) return false

        if (vendedOnOtherMachine != other.vendedOnOtherMachine) return false
        if (price != other.price) return false
        if (machineType != other.machineType) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (vendedOnOtherMachine?.hashCode() ?: 0)
        result = 31 * result + (price ?: 0)
        result = 31 * result + (machineType ?: 0)
        return result
    }

    override fun toString(): String {
        return "VendingData(vendedOnOtherMachine=$vendedOnOtherMachine, price=$price, machineType=$machineType)"
    }


}