package com.manson.domain.fed76.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.fed76.PriceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@ToString(callSuper = true)
public class PlanPriceCheckResponse extends BasePriceCheckResponse {

    private String verdict;
    @JsonProperty("plan_class")
    private String planClass;
    @JsonProperty("plan_subclass")
    private String planSubclass;
    private boolean tradeable;
    @JsonProperty("plan_type")
    private String planType;
    private String formId;
    private PlanReview review;
    private String message;

    public PlanPriceCheckResponse() {
        this.type = PriceType.PLAN;
    }

}
