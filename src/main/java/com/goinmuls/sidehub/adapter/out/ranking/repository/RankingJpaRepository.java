package com.goinmuls.sidehub.adapter.out.ranking.repository;

import com.goinmuls.sidehub.adapter.out.ranking.entity.RankingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface RankingJpaRepository extends JpaRepository<RankingEntity, Long> {
    Optional<RankingEntity> findByMemberIdAndWeekStart(Long memberId, LocalDate startOfWeek);
}
