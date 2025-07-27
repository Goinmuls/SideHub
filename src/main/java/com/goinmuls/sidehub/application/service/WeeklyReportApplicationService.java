package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.dto.CreateWeeklyReportRequest;
import com.goinmuls.sidehub.application.port.in.CreateWeeklyReportUseCase;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.application.port.out.WeeklyReportOutPort;
import com.goinmuls.sidehub.domain.Member;
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

    /**
     * 주간 리포트 발송 내역 데이터 생성
     * @param request
     */
    @Override
    public void createWeeklyReport(CreateWeeklyReportRequest request) {

        Member member = memberOutPort.findMember(request.getMemberId());
        if(member == null) {
            throw  new NoSuchElementException("사용자를 찾을 수 없습니다.");
        }

        weeklyReportOutPort.createWeeklyReport(request);
    }
}
