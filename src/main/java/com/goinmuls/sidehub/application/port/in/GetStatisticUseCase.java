package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.request.GetStatisticRequestDto;
import com.goinmuls.sidehub.adapter.in.dto.response.GetStatisticResponseDto;

public interface GetStatisticUseCase {
    GetStatisticResponseDto getStatistic(GetStatisticRequestDto request);
}
