package com.manson.domain.fo76;

import com.manson.domain.AbstractObject;
import com.manson.domain.fo76.items.enums.DamageType;
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
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ItemCardEntry extends AbstractObject {

    private String text;
    private String value;
    private Integer damageType;
    private Integer difference;
    private Integer diffRating;
    private Integer precision;
    private Integer duration;
    private Boolean showAsDescription;
    private List<ItemCardEntryComponent> components;

    public DamageType getDamageTypeEnum() {
        return DamageType.fromDamageType(damageType);
    }
}
