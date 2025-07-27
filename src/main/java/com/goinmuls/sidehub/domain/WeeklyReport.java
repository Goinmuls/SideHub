package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WeeklyReport {

    private Long id;
    private Long memberId;
    private LocalDate weekStart;
    private String status;
    private String channel;
    private LocalDateTime sentAt;
    private LocalDateTime createdAt;

}
