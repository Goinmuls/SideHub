package com.goinmuls.sidehub.adapter.in.dto.request;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class CreateWeeklyReportRequestDto {

    private Long memberId;
    private String channel;
    private LocalDate startOfWeek;
    private LocalDateTime sendAt;
    private String status;

}
