package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.dto.request.CreateWeeklyReportRequestDto;

public interface CreateWeeklyReportUseCase {
    void createWeeklyReport(CreateWeeklyReportRequestDto request);
}
