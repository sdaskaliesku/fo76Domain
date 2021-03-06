package com.manson.domain.nuka;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class NukaRow {

    @JsonProperty("EDID")
    private String edid;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("formID")
    private String formId;
    private String formType;
}
