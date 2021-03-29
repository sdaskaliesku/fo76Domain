package com.manson.domain.fed76.response;

import com.manson.domain.fed76.PriceType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ItemPriceCheckResponse extends BasePriceCheckResponse {

    private String description;
    private String category;
    private ItemReview review;

    public ItemPriceCheckResponse() {
        this.type = PriceType.ITEM;
    }
}
