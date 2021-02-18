package com.manson.domain.fo76.items.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public enum ArmorGrade {
    Light("Light"), Sturdy("Sturdy"), Heavy("Heavy"), Unknown("Unknown");

    @JsonValue
    private final String value;

    ArmorGrade(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
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
}
