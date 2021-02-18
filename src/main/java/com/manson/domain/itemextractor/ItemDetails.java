package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.config.ArmorConfig;
import com.manson.domain.fo76.items.enums.FilterFlag;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetails {

  private String name;
  private String description;
  private ItemConfig config;
  private String abbreviation;
  private String abbreviationId;
  private ArmorConfig armorConfig;
  private List<LegendaryMod> legendaryMods;
  private ItemSource itemSource;
  private FilterFlag filterFlag;
  private List<Stats> stats;
  private OwnerInfo ownerInfo;
  private Double totalWeight;

}
