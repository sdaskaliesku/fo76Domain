package com.manson.domain.fed76.mapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import lombok.*;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
public class Fed76ApiMapping extends AbstractObject {
    @JsonProperty("by_id")
    private Map<String, Fed76ApiMappingEntry> byId;
    @JsonProperty("by_name")
    private Map<String, Fed76ApiMappingEntry> byName;
}
