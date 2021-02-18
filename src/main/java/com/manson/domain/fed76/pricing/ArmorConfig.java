package com.manson.domain.fed76.pricing;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class ArmorConfig {
    private String armorId;
    private String armorGrade;
}
