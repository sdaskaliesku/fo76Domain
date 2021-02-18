package com.manson.domain.itemextractor;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.AbstractObject;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LegendaryMod extends AbstractObject {

    private String value;
    private int star = 999;
    private String abbreviation;
    private String id;
    private String gameId;
    private String text;
}
