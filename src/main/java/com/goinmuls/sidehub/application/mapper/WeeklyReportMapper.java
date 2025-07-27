package com.goinmuls.sidehub.application.mapper;

import com.goinmuls.sidehub.adapter.out.weeklyReport.entity.WeeklyReportEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class WeeklyReportMapper {

    /**
     * 주간 리포트 엔티티 변환
     * @param memberId
     * @param startOfWeek
     * @param channel
     * @param status
     * @param sentAt
     * @return
     */
    public WeeklyReportEntity toEntity(Long memberId, LocalDate startOfWeek, String channel, String status, LocalDateTime sentAt) {
        return WeeklyReportEntity.of(memberId, startOfWeek, channel, status, sentAt);
    }
}
