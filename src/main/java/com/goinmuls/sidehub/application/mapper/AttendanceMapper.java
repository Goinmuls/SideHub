package com.goinmuls.sidehub.application.mapper;

import com.goinmuls.sidehub.adapter.out.attendance.entity.AttendanceEntity;
import org.springframework.stereotype.Component;

@Component
public class AttendanceMapper {

    /**
     * 출석체크 엔티티 변환
     * @param memberId
     * @return 출석체크 엔티티
     */
    public static AttendanceEntity toEntity(Long memberId) {
        return AttendanceEntity.of(memberId);
    }
}
