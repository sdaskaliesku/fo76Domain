package com.manson.domain.nuka;

import java.util.HashMap;
import java.util.Map;
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
@EqualsAndHashCode
@ToString
public class NukaRequest {

    private String searchtext;
    private Map<String, String> searchmatches;
    private Integer currentPage;
    private Integer prevPage;
    private String prevNext = "start";
    private Map<String, String> map = new HashMap<>();

    public Map<String, String> toMultiPartMap() {
        Map<String, String> map = new HashMap<>(this.map);
        map.put("searchtext", searchtext);
        map.put("currentPage", currentPage.toString());
        map.put("prevPage", prevPage.toString());
        map.put("prevNext", prevNext);
        map.put("searchmatches[name]", "on");
        map.put("searchmatches[EDID]", "on");

        return map;
    }

    private void setWeapon() {
        map.put("fids[WEAP]", "on");
    }

    private void setArmor() {
        map.put("fids[ARMO]", "on");
    }
}
