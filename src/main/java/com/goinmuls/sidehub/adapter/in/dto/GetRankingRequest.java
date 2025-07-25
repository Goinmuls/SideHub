package com.goinmuls.sidehub.adapter.in.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GetRankingRequest {
    private Long memberId;
    private LocalDate startOfWeek;
}
