package com.manson.domain.fed76;

import com.manson.domain.AbstractObject;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
public class AuthorResponse extends AbstractObject {
    private String name;
    private String logo;
    private String description;
    private String url;

}