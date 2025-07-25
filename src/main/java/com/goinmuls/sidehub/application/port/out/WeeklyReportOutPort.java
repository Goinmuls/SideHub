package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;

public interface WeeklyReportOutPort {
    void createWeeklyReport(CreateWeeklyReportRequest request);
}
