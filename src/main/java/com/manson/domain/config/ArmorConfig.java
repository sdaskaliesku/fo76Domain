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
public class ArmorConfig extends AbstractObject {

    private String helper;
    private int dr;
    private int er;
    private int rr;
    private String shortTerm;
    private String armorType;
    private String armorPart;
    private ArmorGrade armorGrade = ArmorGrade.Unknown;
    private String armorId;
    private String gradeId;

}
