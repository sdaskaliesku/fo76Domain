package com.manson.domain.fed76;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class PriceCheckReviewResponse extends AbstractObject {

  @JsonProperty("@context")
  private String context;
  @JsonProperty("@type")
  private String type;

  private AuthorResponse authorResponse;
  private String description;
  private String dateCreated;
  private String url;
  private ReviewRatingResponse reviewRating;
  private PlanReviewResponse review;

}
