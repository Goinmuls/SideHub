package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.adapter.in.dto.GetRankingRequest;
import com.goinmuls.sidehub.domain.Ranking;

public interface RankingOutPort {
    Ranking getRanking(GetRankingRequest request);
}
