package com.manson.domain.fed76.response;

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
public class PlanSubReview extends AbstractObject {

    @JsonProperty("drop_rate")
    private Double dropRate;
    private Double utility;
    private Double farmability;
    @JsonProperty("vendor_min")
    private Integer vendorMin;
    @JsonProperty("vendor_max")
    private Integer vendorMax;
}
