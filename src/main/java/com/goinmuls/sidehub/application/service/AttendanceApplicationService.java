package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.CreateAttendanceUseCase;
import com.goinmuls.sidehub.application.port.out.AttendanceOutPort;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.domain.Attendance;
import com.goinmuls.sidehub.domain.Member;
import com.goinmuls.sidehub.domain.service.AttendanceDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AttendanceApplicationService implements CreateAttendanceUseCase {

    private final AttendanceOutPort attendanceOutPort;
    private final MemberOutPort memberOutPort;
    
    @Override
    public void checkAttendance(Long memberId) {

        Optional.ofNullable(memberOutPort.findMember(memberId))
                .orElseThrow(() -> new NoSuchElementException("사용자를 찾을 수 없습니다."));

        attendanceOutPort.createAttendance(memberId);
    }
}
