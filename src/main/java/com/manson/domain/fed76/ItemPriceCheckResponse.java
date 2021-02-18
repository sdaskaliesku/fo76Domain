package com.manson.domain.fed76;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ItemPriceCheckResponse extends BasePriceCheckResponse {

  private Object review;
}
