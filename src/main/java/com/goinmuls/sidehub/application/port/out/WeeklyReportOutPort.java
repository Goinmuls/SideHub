package com.goinmuls.sidehub.application.port.out;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface WeeklyReportOutPort {
    void createWeeklyReport(Long memberId, LocalDate startOfWeek, String channel, String status, LocalDateTime sentAt);
}
