package com.manson.domain.fed76;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ReviewRatingResponse extends AbstractObject {

    @JsonProperty("@type")
    private String type;
    private String bestRating;
    private String ratingValue;
    private String worstRating;
}