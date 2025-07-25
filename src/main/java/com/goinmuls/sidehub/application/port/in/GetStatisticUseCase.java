package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.GetStatisticRequest;
import com.goinmuls.sidehub.domain.Statistic;

public interface GetStatisticUseCase {
    Statistic getStatistic(GetStatisticRequest request);
}
