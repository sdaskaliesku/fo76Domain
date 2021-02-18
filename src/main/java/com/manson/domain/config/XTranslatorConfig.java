package com.manson.domain.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.AbstractObject;
import lombok.*;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class XTranslatorConfig extends AbstractObject {
    private String id;
    private String gameId;
    private Map<String, String> texts;
    private String rec;
    private String sid;
    private boolean enabled;

    public static XTranslatorConfig fromFo76String(Fo76String fo76String) {
        XTranslatorConfig xTranslatorConfig = new XTranslatorConfig();
        xTranslatorConfig.setId(fo76String.getEdid());
        xTranslatorConfig.setSid(fo76String.getSid());
        xTranslatorConfig.setRec(String.valueOf(fo76String.getRec()));
        if (MapUtils.isEmpty(xTranslatorConfig.getTexts())) {
            xTranslatorConfig.setTexts(new HashMap<>());
        }
        xTranslatorConfig.getTexts().put(fo76String.getLang(), fo76String.getSource());
        return xTranslatorConfig;
    }

    public static XTranslatorConfig merge(XTranslatorConfig base, XTranslatorConfig another) {
        if (StringUtils.equalsIgnoreCase(base.getId(), another.getId())) {
            base.getTexts().putAll(another.getTexts());
        }
        return base;
    }

}