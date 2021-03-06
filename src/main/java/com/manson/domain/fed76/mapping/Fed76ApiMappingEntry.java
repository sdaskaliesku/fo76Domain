package com.manson.domain.fed76.mapping;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.manson.domain.AbstractObject;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
public class Fed76ApiMappingEntry extends AbstractObject {

    @JsonUnwrapped
    private String id;
    @JsonUnwrapped
    private String name;
    @JsonUnwrapped
    private List<String> queries;
    @JsonUnwrapped
    private List<String> ids;


    public final String retrieveId() {
        if (StringUtils.isBlank(this.id)) {
            return String.valueOf(this.name);
        } else {
            return StringUtils.isBlank(this.name) ? String.valueOf(this.id) : "";
        }
    }

}