package com.goinmuls.sidehub.adapter.out.weeklyReport;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;
import com.goinmuls.sidehub.adapter.out.weeklyReport.entity.WeeklyReportEntity;
import com.goinmuls.sidehub.adapter.out.weeklyReport.repository.WeeklyReportJpaRepository;
import com.goinmuls.sidehub.application.port.out.WeeklyReportOutPort;
import com.goinmuls.sidehub.domain.factory.WeeklyReportFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class WeeklyReportPersistenceAdapter implements WeeklyReportOutPort {

    private final WeeklyReportJpaRepository weeklyReportJpaRepository;
    private final WeeklyReportFactory weeklyReportFactory;

    /**
     * 주간 리포트 발송 내역 데이터 생성
     * @param memberId, startOfWeek, channel, status, sentAt
     */
    @Override
    public void createWeeklyReport(Long memberId, LocalDate startOfWeek, String channel, String status, LocalDateTime sentAt) {
        WeeklyReportEntity entity = weeklyReportFactory.from(memberId, startOfWeek, channel, status, sentAt);
        weeklyReportJpaRepository.save(entity);
    }
}
