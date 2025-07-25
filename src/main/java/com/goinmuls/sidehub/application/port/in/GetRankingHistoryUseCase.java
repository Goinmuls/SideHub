package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.domain.RankHistory;

import java.util.List;

public interface GetRankingHistoryUseCase {
    List<RankHistory> getRankHistories(Long memberId);
}
