package com.goinmuls.sidehub.adapter.out.weeklyReport;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;
import com.goinmuls.sidehub.adapter.out.weeklyReport.entity.WeeklyReportEntity;
import com.goinmuls.sidehub.adapter.out.weeklyReport.repository.WeeklyReportJpaRepository;
import com.goinmuls.sidehub.application.port.out.WeeklyReportOutPort;
import com.goinmuls.sidehub.domain.factory.WeeklyReportFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WeeklyReportPersistenceAdapter implements WeeklyReportOutPort {

    private final WeeklyReportJpaRepository jpaRepository;
    private final WeeklyReportFactory weeklyReportFactory;

    @Override
    public void createWeeklyReport(CreateWeeklyReportRequest request) {
        WeeklyReportEntity entity = weeklyReportFactory.from(request);
        jpaRepository.save(entity);
    }
}
