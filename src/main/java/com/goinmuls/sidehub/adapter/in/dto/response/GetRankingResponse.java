package com.goinmuls.sidehub.adapter.in.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 랭킹 응답 객체
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetRankingResponse {
    private Long id;
    private LocalDate weekStart;
    private int rankPosition;
    private int rankChange;

    // factory method
    public static GetRankingResponse of(Long id, LocalDate weekStart, int rankPosition, int rankChange) {
        return new GetRankingResponse(id, weekStart, rankPosition, rankChange);
    }
}
