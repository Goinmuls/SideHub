package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.request.GetRankingRequest;
import com.goinmuls.sidehub.adapter.in.dto.response.GetRankingResponse;
import com.goinmuls.sidehub.domain.Ranking;

public interface GetRankingUseCase {
    GetRankingResponse getRanking(GetRankingRequest request);
}
