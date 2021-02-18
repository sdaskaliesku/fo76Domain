package com.manson.domain.fed76;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class PlanPriceCheckResponse extends BasePriceCheckResponse {

  @JsonProperty("plan_class")
  private String planClass;
  @JsonProperty("plan_subclass")
  private String planSubClass;
  private Boolean tradeable;
  @JsonProperty("plan_type")
  private String planType;
  private String formId;

  private Object review;

}
