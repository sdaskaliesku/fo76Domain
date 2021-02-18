package com.manson.domain.itemextractor;

import com.manson.domain.fo76.items.enums.FilterFlag;
import lombok.*;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class ItemConfig {

  private String text;
  private FilterFlag type;
  private String id;
  private String gameId;
  private String abbreviation;
  private boolean enabled;
  private Map<String, String> texts;

}
