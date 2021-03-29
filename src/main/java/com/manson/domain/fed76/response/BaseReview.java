package com.manson.domain.fed76.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class BaseReview extends AbstractObject {

    @JsonProperty("@context")
    private String context;
    @JsonProperty("@type")
    private String type;
    private Author author;
}
