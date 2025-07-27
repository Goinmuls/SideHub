package com.goinmuls.sidehub.adapter.out.ranking;

import com.goinmuls.sidehub.adapter.in.dto.GetRankingRequest;
import com.goinmuls.sidehub.adapter.out.ranking.entity.RankingEntity;
import com.goinmuls.sidehub.adapter.out.ranking.repository.RankingJpaRepository;
import com.goinmuls.sidehub.application.port.out.RankingOutPort;
import com.goinmuls.sidehub.domain.Ranking;
import com.goinmuls.sidehub.domain.factory.RankingFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@RequiredArgsConstructor
@Component
public class RankingPersistenceAdapter implements RankingOutPort {

    private final RankingJpaRepository rankingJpaRepository;
    private final RankingFactory rankingFactory;

    /**
     * 사용자 금주 랭킹 조회
     * @param memberId, startOfWeek
     * @return 해당 사용자의 금주 랭킹 정보
     */
    @Override
    public Ranking getRanking(Long memberId, LocalDate startOfWeek) {
        RankingEntity rankingEntity = rankingJpaRepository.findByMemberIdAndWeekStart(memberId, startOfWeek)
                .orElse(null);
        return rankingFactory.from(rankingEntity);
    }
}
