package com.manson.domain.fed76.pricing;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class LegendaryMod {
    private String gameId;
    private String abbreviation;
    private String text;
}
