package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.adapter.in.dto.GetStatisticRequest;
import com.goinmuls.sidehub.domain.Statistic;

public interface StatisticOutPort {
    Statistic getStatistic(GetStatisticRequest request);
}
