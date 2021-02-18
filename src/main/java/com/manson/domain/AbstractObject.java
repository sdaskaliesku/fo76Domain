package com.manson.domain;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString
@EqualsAndHashCode
public abstract class AbstractObject {

    private Map<String, Object> unknownFields = new HashMap<>();

    @JsonAnyGetter
    public final Map<String, Object> getUnknownFieldsMap() {
        return this.unknownFields;
    }

    @JsonAnySetter
    public final void setUnknownField(String key, Object value) {
        this.unknownFields.put(key, value);
    }
}
