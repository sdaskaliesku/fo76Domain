package com.manson.domain.itemextractor;

import com.manson.domain.fo76.items.enums.FilterFlag;
import java.util.Map;
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
public class ItemConfig {

    private String text;
    private FilterFlag type;
    private String id;
    private String gameId;
    private String abbreviation;
    private boolean enabled;
    private Map<String, String> texts;

}
