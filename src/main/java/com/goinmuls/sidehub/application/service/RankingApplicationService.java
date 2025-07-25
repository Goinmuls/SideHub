package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.GetRankingRequest;
import com.goinmuls.sidehub.application.port.in.GetRankingUseCase;
import com.goinmuls.sidehub.application.port.out.RankingOutPort;
import com.goinmuls.sidehub.domain.Ranking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RankingApplicationService implements GetRankingUseCase {

    private final RankingOutPort rankingOutPort;

    @Override
    public Ranking getRanking(GetRankingRequest request) {
        // todo: memberId의 member가 존재하는지 확인
        return rankingOutPort.getRanking(request);
    }
}
