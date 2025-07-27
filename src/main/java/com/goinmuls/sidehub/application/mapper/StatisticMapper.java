package com.goinmuls.sidehub.application.mapper;

import com.goinmuls.sidehub.adapter.in.dto.response.GetStatisticResponse;
import com.goinmuls.sidehub.domain.Statistic;
import org.springframework.stereotype.Component;

@Component
public class StatisticMapper {

    /**
     * 통계 도메인 -> 통계 응답 객체 변환
     * @param statistic (도메인)
     * @return GetStatisticResponse (응답 객체)
     */
    public GetStatisticResponse toResponse(Statistic statistic) {
        if(statistic == null) {
            return null;
        }

        return GetStatisticResponse.of(
                statistic.getId(),
                statistic.getWeekStart(),
                statistic.getTaskDoneCount(),
                statistic.getAttendanceCount(),
                statistic.getContributionScore()
        );
    }
}
