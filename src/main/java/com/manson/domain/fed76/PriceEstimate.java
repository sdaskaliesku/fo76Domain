package com.manson.domain.fed76;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PriceEstimate {

    private String name;
    private Integer price;
    private String timestamp;
    private String path;
    private String review;
    private String vendor;
    private Integer minPrice;
    private Integer maxPrice;
    private String niche;
    private Integer original;
    private String description;
    private String reviewDescription;

}
