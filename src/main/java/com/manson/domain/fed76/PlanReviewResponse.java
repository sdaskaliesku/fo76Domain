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
public class PlanReviewResponse extends AbstractObject {

  @JsonProperty("drop_rate")
  private Integer dropRate;
  private Integer utility;
  private Integer farmability;
  @JsonProperty("vendor_min")
  private Integer vendorMin;
  @JsonProperty("vendor_max")
  private Integer vendorMax;

}
