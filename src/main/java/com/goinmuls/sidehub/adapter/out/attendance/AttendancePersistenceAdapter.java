package com.goinmuls.sidehub.adapter.out.attendance;

import com.goinmuls.sidehub.adapter.out.attendance.entity.AttendanceEntity;
import com.goinmuls.sidehub.adapter.out.attendance.repository.AttendanceJpaRepository;
import com.goinmuls.sidehub.application.port.out.AttendanceOutPort;
import com.goinmuls.sidehub.domain.factory.AttendanceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AttendancePersistenceAdapter implements AttendanceOutPort {

    private final AttendanceJpaRepository jpaRepository;
    private final AttendanceFactory attendanceFactory;

    /**
     * 출석 체크 out port 구현체
     * @param memberId
     */
    @Override
    public void createAttendance(Long memberId) {
        AttendanceEntity entity = attendanceFactory.from(memberId);
        jpaRepository.save(entity);
    }
}
