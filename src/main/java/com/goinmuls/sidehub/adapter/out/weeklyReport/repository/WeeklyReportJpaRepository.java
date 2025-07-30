package com.goinmuls.sidehub.adapter.out.weeklyReport.repository;

import com.goinmuls.sidehub.adapter.out.weeklyReport.entity.WeeklyReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyReportJpaRepository extends JpaRepository<WeeklyReportEntity, Long> {
}
