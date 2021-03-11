package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class LegendaryModConfig {

    private String abbreviation;
    private String abbreviationId;
    private List<LegendaryMod> legendaryMods;

}
