package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.MemberProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberProfileJpaRepository extends JpaRepository<MemberProfileEntity, Long> {
    Optional<MemberProfileEntity> findByMemberId(Long memberId);
}
