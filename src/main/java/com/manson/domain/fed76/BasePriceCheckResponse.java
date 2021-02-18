package com.manson.domain.fed76;

import com.manson.domain.AbstractObject;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class BasePriceCheckResponse extends AbstractObject {

  private String name;
  private Integer price;
  private String category;
  private String timestamp;
  private String path;
  private String description;

}
