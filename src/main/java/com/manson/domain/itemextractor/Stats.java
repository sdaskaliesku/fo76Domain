package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.fo76.items.enums.DamageType;
import com.manson.domain.fo76.items.enums.ItemCardText;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {

  private ItemCardText itemCardText;
  private String value;
  private DamageType damageType;

}
