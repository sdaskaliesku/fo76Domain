package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.config.ArmorConfig;
import java.util.List;
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
public class ItemDetails {

    private String name;
    private String description;
    private ItemConfig config;
    private ArmorConfig armorConfig;
    private ItemSource itemSource;
    private LegendaryModConfig legendaryModConfig;
    private List<Stats> stats;
    private OwnerInfo ownerInfo;
    private Double totalWeight;
    private boolean obtainable;
    private String note;

}
