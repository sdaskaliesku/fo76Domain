package com.manson.domain.fo76.items.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public enum ArmorGrade {
    Light("Light"), Sturdy("Sturdy"), Heavy("Heavy"), Unknown("Unknown");

    @JsonValue
    private final String value;

    ArmorGrade(String value) {
        this.value = value;
    }

    public static ArmorGrade fromString(String input) {
        if (StringUtils.isBlank(input)) {
            return Unknown;
        }
        return Arrays.stream(ArmorGrade.values())
            .filter(x -> StringUtils.equalsIgnoreCase(x.value, input))
            .findFirst()
            .orElse(Unknown);
    }

    public String getValue() {
        return value;
    }
}
