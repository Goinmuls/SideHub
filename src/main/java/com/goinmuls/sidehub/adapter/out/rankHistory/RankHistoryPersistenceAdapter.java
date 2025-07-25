package com.goinmuls.sidehub.adapter.out.rankHistory;

import com.goinmuls.sidehub.adapter.out.rankHistory.entity.RankHistoryEntity;
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

    private final RankHistoryJpaRepository jpaRepository;
    private final RankHistoryFactory rankHistoryFactory;

    @Override
    public List<RankHistory> getRankHistories(Long memberId) {
        return jpaRepository.findAllByMemberId(memberId).stream()
                .map(rankHistoryFactory::from)
                .collect(Collectors.toList());
    }
}
