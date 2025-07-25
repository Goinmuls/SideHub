package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.CreateAttendanceUseCase;
import com.goinmuls.sidehub.application.port.out.AttendanceOutPort;
import com.goinmuls.sidehub.domain.Attendance;
import com.goinmuls.sidehub.domain.service.AttendanceDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AttendanceApplicationService implements CreateAttendanceUseCase {

    private final AttendanceOutPort attendanceOutPort;
    private final AttendanceDomainService attendanceDomainService;

    @Override
    public void checkAttendance(Long memberId) {

        // todo: memberId의 member가 존재하는지 확인
        attendanceOutPort.createAttendance(memberId);
    }
}
