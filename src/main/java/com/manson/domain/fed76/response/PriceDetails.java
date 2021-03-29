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
public class PriceDetails extends AbstractObject {

    private String vendor;
    @JsonProperty("market-low")
    private String marketLow;
    @JsonProperty("market-high")
    private String marketHigh;
    private String niche;
    private String original;
}
