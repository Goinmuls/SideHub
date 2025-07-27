package com.goinmuls.sidehub.adapter.out.attendance.repository;

import com.goinmuls.sidehub.adapter.out.attendance.entity.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceJpaRepository extends JpaRepository<AttendanceEntity, Long> {
}
