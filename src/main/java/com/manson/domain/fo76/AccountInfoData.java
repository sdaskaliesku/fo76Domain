package com.manson.domain.fo76;

import com.manson.domain.AbstractObject;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AccountInfoData extends AbstractObject {

    private String name;
}
