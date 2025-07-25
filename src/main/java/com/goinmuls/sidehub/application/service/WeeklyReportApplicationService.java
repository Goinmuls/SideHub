package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;
import com.goinmuls.sidehub.application.port.in.CreateWeeklyReportUseCase;
import com.goinmuls.sidehub.application.port.out.WeeklyReportOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class WeeklyReportApplicationService implements CreateWeeklyReportUseCase {

    private final WeeklyReportOutPort weeklyReportOutPort;

    @Override
    public void createWeeklyReport(CreateWeeklyReportRequest request) {
        // todo: memberId의 member가 존재하는지 확인
        weeklyReportOutPort.createWeeklyReport(request);
    }
}
