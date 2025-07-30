package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.application.port.in.CheckAttendanceUseCase;
import com.goinmuls.sidehub.application.port.out.AttendanceOutPort;
import com.goinmuls.sidehub.application.port.out.MemberOutPort;
import com.goinmuls.sidehub.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AttendanceApplicationService implements CheckAttendanceUseCase {

    private final AttendanceOutPort attendanceOutPort;
    private final MemberOutPort memberOutPort;

    /**
     * 출석 체크
     * @param memberId
     */
    @Override
    public void checkAttendance(Long memberId) {

        Member member = memberOutPort.findMember(memberId);
        if(member == null) {
            throw  new NoSuchElementException("사용자를 찾을 수 없습니다.");
        }
        attendanceOutPort.createAttendance(memberId);
    }
}
