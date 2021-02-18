package com.manson.domain.fed76;

import com.manson.domain.AbstractObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class ReviewRatingResponse extends AbstractObject {
   private String bestRating;
   private String ratingValue;
   private String worstRating;
}