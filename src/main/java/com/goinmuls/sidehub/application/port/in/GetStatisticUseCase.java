package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.request.GetStatisticRequest;
import com.goinmuls.sidehub.adapter.in.dto.response.GetStatisticResponse;
import com.goinmuls.sidehub.domain.Statistic;

public interface GetStatisticUseCase {
    GetStatisticResponse getStatistic(GetStatisticRequest request);
}
