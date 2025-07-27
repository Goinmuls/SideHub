package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.request.GetRankingRequest;
import com.goinmuls.sidehub.domain.Ranking;

public interface GetRankingUseCase {
    Ranking getRanking(GetRankingRequest request);
}
