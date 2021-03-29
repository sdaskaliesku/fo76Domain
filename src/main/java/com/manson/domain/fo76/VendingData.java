package com.manson.domain.fo76;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.AbstractObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendingData extends AbstractObject {

    private Boolean isVendedOnOtherMachine;
    private Integer price;
    private Integer machineType;

}
