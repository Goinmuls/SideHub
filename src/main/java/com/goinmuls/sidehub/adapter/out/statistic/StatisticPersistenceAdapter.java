package com.goinmuls.sidehub.adapter.out.statistic;

import com.goinmuls.sidehub.adapter.in.dto.GetStatisticRequest;
import com.goinmuls.sidehub.adapter.out.statistic.entity.StatisticEntity;
import com.goinmuls.sidehub.adapter.out.statistic.repository.StatisticJpaRepository;
import com.goinmuls.sidehub.application.port.out.StatisticOutPort;
import com.goinmuls.sidehub.domain.Statistic;
import com.goinmuls.sidehub.domain.factory.StatisticFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@RequiredArgsConstructor
@Component
public class StatisticPersistenceAdapter implements StatisticOutPort {

    private final StatisticJpaRepository statisticJpaRepository;
    private final StatisticFactory statisticFactory;

    /**
     * 사용자 금주 통계 조회
     * @param memberId, startOfWeek
     * @return 해당 사용자의 금주 통계 정보
     */
    @Override
    public Statistic getStatistic(Long memberId, LocalDate startOfWeek) {
        StatisticEntity statisticEntity = statisticJpaRepository.findByMemberIdAndWeekStart(memberId, startOfWeek)
                .orElse(null);
        return statisticFactory.from(statisticEntity);
    }
}
