package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RankHistory {

    private Long id;
    private Long memberId;
    private LocalDate weekStart;
    private int rankPosition;
    private int contributionScore;

    // factory method
    public static RankHistory of(Long id, Long memberId, LocalDate weekStart, int rankPosition) {
        return new RankHistory();
    }

}
