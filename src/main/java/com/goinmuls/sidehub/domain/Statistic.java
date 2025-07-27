package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Statistic {

    private Long id;
    private Long memberId;
    private LocalDate weekStart;
    private int taskDoneCount;
    private int attendanceCount;
    private int contributionScore;

    // factory method
    public static Statistic of (Long id, LocalDate weekStart, int taskDoneCount, int attendanceCount, int contributionScore) {
        return new Statistic();
    }
}
