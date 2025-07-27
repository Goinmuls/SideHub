package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.weeklyReport.entity.WeeklyReportEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class WeeklyReportFactory {

    public WeeklyReportEntity from (Long memberId, LocalDate startOfWeek, String channel, String status, LocalDateTime sentAt) {
        return WeeklyReportEntity.of(memberId, startOfWeek, channel, status, sentAt);
    }
}
