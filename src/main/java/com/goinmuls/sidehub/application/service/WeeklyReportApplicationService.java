package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;
import com.goinmuls.sidehub.application.port.in.CreateWeeklyReportUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.WeeklyReportOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class WeeklyReportApplicationService implements CreateWeeklyReportUseCase {

    private final WeeklyReportOutPort weeklyReportOutPort;
    private final MemberOutPort memberOutPort;

    @Override
    public void createWeeklyReport(CreateWeeklyReportRequest request) {

        Optional.ofNullable(memberOutPort.findMember(request.getMemberId()))
                .orElseThrow(() -> new NoSuchElementException("사용자를 찾을 수 없습니다."));

        weeklyReportOutPort.createWeeklyReport(request);
    }
}
