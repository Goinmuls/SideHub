package com.goinmuls.sidehub.adapter.in.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class CreateWeeklyReportRequest {

    private Long memberId;
    private String channel;
    private LocalDate startOfWeek;
    private LocalDateTime sendAt;
    private String status;

}
