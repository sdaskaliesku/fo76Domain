package com.manson.domain.fed76.response;

import com.manson.domain.fed76.ReviewRatingResponse;
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
public class ItemReview extends BaseReview {

    private PriceDetails details;
    private String dateCreated;
    private String description;
    private String name;
    private String url;
    private ReviewRatingResponse reviewRating;
}
