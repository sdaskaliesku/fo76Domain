package com.manson.domain.fo76;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import com.manson.domain.fo76.items.enums.FilterFlag;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ItemDescriptor extends AbstractObject {

  private String text;
  @Builder.Default
  private long serverHandleId = -1L;
  private int count;
  private int itemValue;
  @Builder.Default
  private long filterFlag = -1;
  private Integer currentHealth;
  private Integer damage;
  private Integer durability;
  private Integer maximumHealth;
  private Double weight;
  private Double weaponDisplayAccuracy;
  private Double weaponDisplayRateOfFire;
  private Double weaponDisplayRange;
  private int numLegendaryStars;
  @Builder.Default
  private int itemLevel = -1;
  @Builder.Default
  private int rarity = -1;
  private boolean isTradable;
  private boolean isSpoiled;
  private boolean isSetItem;
  private boolean isSetBonusActive;
  private boolean isQuestItem;
  private boolean isLegendary;
  private boolean isLearnedRecipe;
  private boolean isCurrency;
  private boolean isWeightless;
  private boolean isAutoScrappable;
  private boolean canGoIntoScrapStash;
  private boolean scrapAllowed;
  @JsonProperty("ItemCardEntries")
  private List<ItemCardEntry> itemCardEntries;
  private VendingData vendingData;
  @JsonProperty("ModCardEntries")
  private List<ModCardEntry> modCardEntries;

  @JsonIgnore
  public FilterFlag getFilterFlagEnum() {
    return FilterFlag.fromInt(filterFlag);
  }

}
