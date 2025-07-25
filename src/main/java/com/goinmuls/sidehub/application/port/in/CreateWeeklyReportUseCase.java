package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;

public interface CreateWeeklyReportUseCase {
    void createWeeklyReport(CreateWeeklyReportRequest request);
}
