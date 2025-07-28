package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.domain.Recruitment;
import org.springframework.stereotype.Component;

@Component
public class RecruitmentFactory {
    /**
     * 엔티티 -> 도메인 변환
     */
    public Recruitment fromEntity(RecruitmentEntity recruitmentEntity) {

        if (recruitmentEntity == null) {
            return null;
        }

        return Recruitment.of(
                recruitmentEntity.getRecruitmentId(),
                recruitmentEntity.getName(),
                recruitmentEntity.getIntroduction(),
                recruitmentEntity.getDescription(),
                recruitmentEntity.getSkill(),
                recruitmentEntity.getStartAt(),
                recruitmentEntity.getEndAt(),
                recruitmentEntity.getRecruitmentStatus(),
                recruitmentEntity.getRecruiterId(),
                recruitmentEntity.getHeadCount(),
                recruitmentEntity.getCreatedAt(),
                recruitmentEntity.getEditedAt(),
                recruitmentEntity.getDeletedAt(),
                recruitmentEntity.isDeleted()
        );
    }
}
