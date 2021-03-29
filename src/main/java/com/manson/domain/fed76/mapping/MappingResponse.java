package com.manson.domain.fed76.mapping;

import com.manson.domain.AbstractObject;
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
@ToString
public class MappingResponse extends AbstractObject {

    private Fed76ApiMapping items;
    private Fed76ApiMapping effects;
}
