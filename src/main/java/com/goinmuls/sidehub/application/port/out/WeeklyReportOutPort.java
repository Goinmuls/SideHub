package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface WeeklyReportOutPort {
    void createWeeklyReport(Long memberId, LocalDate startOfWeek, String channel, String status, LocalDateTime sentAt);
}
