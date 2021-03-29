package com.manson.domain.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.fo76.items.enums.FilterFlag;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class LegendaryModDescriptor extends XTranslatorConfig {

    private int star = 0;
    private String abbreviation;
    private List<String> additionalAbbreviations;
    private Map<String, String> translations;
    private FilterFlag itemType;

    private static String prepareString(String input) {
        return input.trim().replace("'", "").replace("+", "").replace(".", "").replace("¢", "");
    }

    @JsonIgnore
    public boolean isTheSameMod(String modName, FilterFlag filterFlag) {
        if (filterFlag != FilterFlag.UNKNOWN) {
            if (itemType != filterFlag && !filterFlag.getSubtypes().contains(itemType) && !itemType.getSubtypes()
                .contains(filterFlag)) {
                return false;
            }
        }
        String input = prepareString(modName);
        for (String text : getTexts().values()) {
            if (StringUtils.equalsIgnoreCase(prepareString(text), input)) {
                return true;
            }
        }
        for (String translation : translations.values()) {
            if (StringUtils.equalsIgnoreCase(prepareString(translation), input)) {
                return true;
            }
        }
        return false;
    }
}
