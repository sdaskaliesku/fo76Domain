package com.manson.domain.itemextractor;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manson.domain.AbstractObject;
import com.manson.domain.fo76.AccountInfoData;
import com.manson.domain.fo76.CharacterInfoData;
import com.manson.domain.fo76.ItemDescriptor;
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
public class CharacterInventory extends AbstractObject {

    private List<ItemDescriptor> playerInventory;
    private List<ItemDescriptor> stashInventory;
    @JsonProperty("AccountInfoData")
    private AccountInfoData accountInfoData;
    @JsonProperty("CharacterInfoData")
    private CharacterInfoData characterInfoData;

}
