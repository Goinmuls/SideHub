package com.goinmuls.sidehub.adapter.out.rankHistory;

import com.goinmuls.sidehub.adapter.out.rankHistory.repository.RankHistoryJpaRepository;
import com.goinmuls.sidehub.application.port.out.RankingHistoryOutPort;
import com.goinmuls.sidehub.domain.RankHistory;
import com.goinmuls.sidehub.domain.factory.RankHistoryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class RankHistoryPersistenceAdapter implements RankingHistoryOutPort {

    private final RankHistoryJpaRepository rankHistoryJpaRepository;
    private final RankHistoryFactory rankHistoryFactory;

    /**
     * 사용자 랭킹 추이 히스토리 목록 조회
     * @param memberId
     * @return 해당 사용자의 랭킹 추이 히스토리 목록
     */
    @Override
    public List<RankHistory> getRankHistories(Long memberId) {
        return rankHistoryJpaRepository.findAllByMemberId(memberId).stream()
                .map(rankHistoryFactory::from)
                .collect(Collectors.toList());
    }
}
