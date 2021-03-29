package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.fed76.PriceEstimate;
import com.manson.domain.fo76.VendingData;
import com.manson.domain.fo76.items.enums.FilterFlag;
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
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemResponse {

    private String id;
    private String text;
    private Long serverHandleId;
    private Integer count;
    private Integer itemValue;
    private Double weight;
    private Integer itemLevel;
    private Integer numLegendaryStars;
    private Boolean isTradable;
    private Boolean isSpoiled;
    private Boolean isSetItem;
    private Boolean isQuestItem;
    private Boolean isLegendary;
    private VendingData vendingData;
    private FilterFlag filterFlag;
    private ItemDetails itemDetails;
    private Boolean isWeightless;
    private Boolean scrapAllowed;
    private Boolean isAutoScrappable;
    private Boolean canGoIntoScrapStash;
    private Boolean isLearnedRecipe;
    private PriceEstimate priceCheckResponse;

}
