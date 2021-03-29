package com.manson.domain.config;

import com.manson.domain.AbstractObject;
import com.manson.domain.fo76.items.enums.ArmorGrade;
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
public class ArmorGradeConfig extends AbstractObject {

    private String armorId;
    private ArmorGrade armorGrade;

}
