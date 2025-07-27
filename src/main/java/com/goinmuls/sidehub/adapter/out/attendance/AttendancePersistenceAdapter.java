package com.goinmuls.sidehub.adapter.out.attendance;

import com.goinmuls.sidehub.adapter.out.attendance.entity.AttendanceEntity;
import com.goinmuls.sidehub.adapter.out.attendance.repository.AttendanceJpaRepository;
import com.goinmuls.sidehub.application.mapper.AttendanceMapper;
import com.goinmuls.sidehub.application.port.out.AttendanceOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AttendancePersistenceAdapter implements AttendanceOutPort {

    private final AttendanceJpaRepository attendanceJpaRepository;
    private final AttendanceMapper attendanceMapper;

    /**
     * 출석 체크
     * @param memberId
     */
    @Override
    public void createAttendance(Long memberId) {
        AttendanceEntity entity = attendanceMapper.toEntity(memberId);
        attendanceJpaRepository.save(entity);
    }
}
