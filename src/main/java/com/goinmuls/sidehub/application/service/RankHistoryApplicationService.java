package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.GetRankingHistoryUseCase;
import com.goinmuls.sidehub.application.port.out.RankingHistoryOutPort;
import com.goinmuls.sidehub.domain.RankHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RankHistoryApplicationService implements GetRankingHistoryUseCase {

    private final RankingHistoryOutPort rankingHistoryOutPort;

    public List<RankHistory> getRankHistories(Long memberId) {
        // todo: memberId의 member가 존재하는지 확인
        return rankingHistoryOutPort.getRankHistories(memberId);
    }
}
