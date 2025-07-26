package com.goinmuls.sidehub.adapter.out.statistic;

import com.goinmuls.sidehub.adapter.in.dto.GetStatisticRequest;
import com.goinmuls.sidehub.adapter.out.statistic.entity.StatisticEntity;
import com.goinmuls.sidehub.adapter.out.statistic.repository.StatisticJpaRepository;
import com.goinmuls.sidehub.application.port.out.StatisticOutPort;
import com.goinmuls.sidehub.domain.Statistic;
import com.goinmuls.sidehub.domain.factory.StatisticFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StatisticPersistenceAdapter implements StatisticOutPort {

    private final StatisticJpaRepository jpaRepository;
    private final StatisticFactory statisticFactory;

    /**
     * 사용자 금주 통계 조회
     * @param request
     * @return 해당 사용자의 금주 통계 정보
     */
    @Override
    public Statistic getStatistic(GetStatisticRequest request) {
        StatisticEntity statisticEntity = jpaRepository.findByMemberIdAndWeekStart(request.getMemberId(), request.getStartOfWeek())
                .orElse(null);
        return statisticFactory.from(statisticEntity);
    }
}
