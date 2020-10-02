package com.manson.domain.fed76.pricing

import com.manson.AbstractObject

open class PriceCheckResponse : AbstractObject() {

    var name: String = "EMPTY"
    var price: Int = 0
    var review: ReviewResponse = ReviewResponse()
    var timestamp: String = "EMPTY"
    var path: String = "EMPTY"
    var description: String = "EMPTY"

    override fun toString(): String {
        return "PriceCheckResponse(name='$name', price=$price, review=$review, timestamp='$timestamp', path='$path', description='$description')"
    }


}