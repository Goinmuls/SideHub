package com.goinmuls.sidehub.adapter.out.statistic.repository;

import com.goinmuls.sidehub.adapter.out.statistic.entity.StatisticEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface StatisticJpaRepository extends JpaRepository<StatisticEntity, Long> {
    Optional<StatisticEntity> findByMemberIdAndWeekStart(Long memberId, LocalDate startOfWeek);
}
