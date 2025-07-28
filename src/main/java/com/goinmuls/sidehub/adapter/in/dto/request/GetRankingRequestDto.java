package com.goinmuls.sidehub.adapter.in.dto.request;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GetRankingRequestDto {
    private Long memberId;
    private LocalDate startOfWeek;
}
