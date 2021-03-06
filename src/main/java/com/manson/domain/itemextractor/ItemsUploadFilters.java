package com.manson.domain.itemextractor;

import com.manson.domain.AbstractObject;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ItemsUploadFilters extends AbstractObject {

    private List<String> filterFlags;
    @Builder.Default
    private boolean legendaryOnly = false;
    @Builder.Default
    private boolean tradableOnly = false;
    @Builder.Default
    private boolean priceCheckOnly = false;

}
