package com.goinmuls.sidehub.adapter.in.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 랭킹 변화 히스토리 응답 객체
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetRankHistoryResponseDto {
    private Long id;
    private LocalDate weekStart;
    private int rankPosition;
    private int contributionScore;

    // factory method
    public static GetRankHistoryResponseDto of(Long id, LocalDate weekStart, int rankPosition, int contributionScore) {
        return new GetRankHistoryResponseDto(id, weekStart, rankPosition, contributionScore);
    }
}
