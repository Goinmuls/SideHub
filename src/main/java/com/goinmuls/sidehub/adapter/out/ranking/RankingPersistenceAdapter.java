package com.goinmuls.sidehub.adapter.out.ranking;

import com.goinmuls.sidehub.adapter.in.dto.GetRankingRequest;
import com.goinmuls.sidehub.adapter.out.ranking.entity.RankingEntity;
import com.goinmuls.sidehub.adapter.out.ranking.repository.RankingJpaRepository;
import com.goinmuls.sidehub.application.port.out.RankingOutPort;
import com.goinmuls.sidehub.domain.Ranking;
import com.goinmuls.sidehub.domain.factory.RankingFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RankingPersistenceAdapter implements RankingOutPort {

    private final RankingJpaRepository jpaRepository;
    private final RankingFactory rankingFactory;

    @Override
    public Ranking getRanking(GetRankingRequest request) {
        RankingEntity rankingEntity = jpaRepository.findByMemberIdAndWeekStart(request.getMemberId(), request.getStartOfWeek())
                .orElse(null);
        return rankingFactory.from(rankingEntity);
    }
}
