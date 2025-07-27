package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecruitmentJpaRepository extends JpaRepository<RecruitmentEntity, Long> {
    Optional<RecruitmentEntity> findByRecruitmentId(Long recruitmentId);
    List<RecruitmentEntity> findAllByRecruitmentId();
}
