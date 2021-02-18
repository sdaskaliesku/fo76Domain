package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manson.domain.AbstractObject;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModDataRequest extends AbstractObject {

  private ModData modData;
  private ItemsUploadFilters filters;
  private Double version;

}
