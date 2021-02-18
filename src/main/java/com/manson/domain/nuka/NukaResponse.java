package com.manson.domain.nuka;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class NukaResponse {
    private Integer current;
    private List<NukaRow> rows;
}
