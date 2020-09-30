package com.manson.domain.fed76.pricing

import com.manson.AbstractObject

open class ReviewRatingResponse : AbstractObject() {
    var bestRating: String = "EMPTY"
    var ratingValue: String = "EMPTY"
    var worstRating: String = "EMPTY"
    override fun toString(): String {
        return "ReviewRatingResponse(bestRating='$bestRating', ratingValue='$ratingValue', worstRating='$worstRating')"
    }

}