package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Ranking;

import java.time.LocalDate;

public interface RankingOutPort {
    Ranking getRanking(Long memberId, LocalDate startOfWeek);
}
