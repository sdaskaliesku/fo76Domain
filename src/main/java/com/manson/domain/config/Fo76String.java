package com.manson.domain.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Fo76String extends AbstractObject {
    @JsonProperty("EDID")
    private String edid = "";
    @JsonProperty("REC")
    private Object rec;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("Dest")
    private String dest;
    @JsonProperty("-List")
    private String list;
    @JsonProperty("-sID")
    private String sid;
    private String lang;

}