package com.goinmuls.sidehub.adapter.out.rankHistory.repository;

import com.goinmuls.sidehub.adapter.out.rankHistory.entity.RankHistoryEntity;
import com.goinmuls.sidehub.domain.RankHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RankHistoryJpaRepository extends JpaRepository<RankHistory, Long> {
    List<RankHistoryEntity> findAllByMemberId(Long memberId);

}
