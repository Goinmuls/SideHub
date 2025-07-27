package com.goinmuls.sidehub.adapter.in.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/***
 * 통계 응답 객체
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetStatisticResponse {
    private Long id;
    private LocalDate weekStart;
    private int taskDoneCount;
    private int attendanceCount;
    private int contributionScore;

    // factory method
    public static GetStatisticResponse of(Long id, LocalDate weekStart, int taskDoneCount, int attendanceCount, int contributionScore) {
        return new GetStatisticResponse(id, weekStart, taskDoneCount, attendanceCount, contributionScore);
    }
}
