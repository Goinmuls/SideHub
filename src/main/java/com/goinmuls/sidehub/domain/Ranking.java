package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Ranking {

    private Long id;
    private Long memberId;
    private LocalDate weekStart;
    private int rankPosition;
    private int rankChange;

    // factory method
    public static Ranking of (Long id, LocalDate weekStart, int rankPosition, int rankChange) {
        return new Ranking();
    }

}
