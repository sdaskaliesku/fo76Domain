package com.manson.domain.nuka;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class NukaRow {
    @JsonProperty("EDID")
    private String edid;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("formID")
    private String formId;
    private String formType;
}
