package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.Statistic;

import java.time.LocalDate;

public interface StatisticOutPort {
    Statistic getStatistic(Long memberId, LocalDate startOfWeek);
}
