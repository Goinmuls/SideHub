package com.goinmuls.sidehub.adapter.in.dto.request;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GetStatisticRequest {
    private Long memberId;
    private LocalDate startOfWeek;
}
