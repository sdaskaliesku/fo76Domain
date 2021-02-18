package com.manson.domain.fed76.pricing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class PriceEnhanceRequest {
    private VendorData vendingData;
    private ArmorConfig armorConfig;
    private List<LegendaryMod> legendaryMods;

    @JsonIgnore
    public boolean isValid() {
        boolean validPrice = Objects.nonNull(vendingData) && Objects.nonNull(vendingData.getPrice()) && vendingData.getPrice() > 0;
        boolean validMods = CollectionUtils.isNotEmpty(legendaryMods) && legendaryMods.stream().allMatch(x -> StringUtils.isNotBlank(x.getGameId()));
        boolean validConfig = true;
        if (Objects.nonNull(armorConfig)) {
            validConfig = StringUtils.isNoneBlank(armorConfig.getArmorId(), armorConfig.getArmorGrade());
        }
        return validConfig && validMods && validPrice;
    }
}
