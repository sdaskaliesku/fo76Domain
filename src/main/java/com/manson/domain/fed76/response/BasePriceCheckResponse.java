package com.manson.domain.fed76.response;

import com.manson.domain.AbstractObject;
import com.manson.domain.fed76.PriceType;
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
public class BasePriceCheckResponse extends AbstractObject {

    protected PriceType type;
    private String name;
    private Integer price;
    private String timestamp;
    private String path;
}
