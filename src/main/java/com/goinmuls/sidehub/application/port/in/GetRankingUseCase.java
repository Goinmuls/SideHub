package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.request.GetRankingRequestDto;
import com.goinmuls.sidehub.adapter.in.dto.response.GetRankingResponseDto;

public interface GetRankingUseCase {
    GetRankingResponseDto getRanking(GetRankingRequestDto request);
}
