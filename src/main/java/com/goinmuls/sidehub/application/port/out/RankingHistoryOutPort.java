package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.RankHistory;

import java.util.List;

public interface RankingHistoryOutPort {
    List<RankHistory> getRankHistories(Long memberId);
}
