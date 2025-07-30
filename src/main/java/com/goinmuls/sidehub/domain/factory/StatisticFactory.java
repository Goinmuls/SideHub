package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.statistic.entity.StatisticEntity;
import com.goinmuls.sidehub.domain.Statistic;
import org.springframework.stereotype.Component;

/**
 * 계층 변환 class
 */
@Component
public class StatisticFactory {

    public Statistic from(StatisticEntity entity) {
        if (entity == null) return null;
        return Statistic.of(
                entity.getId(),
                entity.getWeekStart(),
                entity.getTaskDoneCount(),
                entity.getAttendanceCount(),
                entity.getContributionScore()
        );
    }
}
