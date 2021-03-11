package com.manson.domain.fed76;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceCheckResponse {

    private String name;
    private Integer price;
    private String url;
    private String category;
    private String reviewDescription;
    private String reviewName;
    private String description;
    private String rating;
    private String verdict;

}
