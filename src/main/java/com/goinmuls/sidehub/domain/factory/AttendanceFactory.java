package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.attendance.entity.AttendanceEntity;
import com.goinmuls.sidehub.domain.Attendance;
import org.springframework.stereotype.Component;

@Component
public class AttendanceFactory {

    public Attendance from (AttendanceEntity entity) {
        if (entity == null) return null;

        return Attendance.of(entity.getId());
    }

    public AttendanceEntity from (Long memberId) {
        return AttendanceEntity.of(memberId);
    };
}
