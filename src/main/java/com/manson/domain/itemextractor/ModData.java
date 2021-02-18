package com.manson.domain.itemextractor;

import com.manson.domain.AbstractObject;
import lombok.*;
import org.apache.commons.collections4.MapUtils;

import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ModData extends AbstractObject {

  private Map<String, CharacterInventory> characterInventories;
  private Double version;
  private Date dumpDate;

  public boolean isEmpty() {
    return MapUtils.isEmpty(characterInventories);
  }

  public Map<String, CharacterInventory> getCharacterInventories() {
    return characterInventories;
  }

  public void setCharacterInventories(
      Map<String, CharacterInventory> characterInventories) {
    this.characterInventories = characterInventories;
  }

  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public Date getDumpDate() {
    return dumpDate;
  }

  public void setDumpDate(Date dumpDate) {
    this.dumpDate = dumpDate;
  }
}
