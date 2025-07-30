package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.domain.Recruitment;
import org.springframework.stereotype.Component;

@Component
public class PostRecruitmentMapper {

    /**
     * 도메인 -> 엔티티 변환
     * @param recruitment 도메인
     * @return 엔티티
     */
    public RecruitmentEntity toEntity(Recruitment recruitment) {
        if (recruitment == null) {
            return null;
        }

        return RecruitmentEntity.of(
                recruitment.getRecruitmentId(),
                recruitment.getName(),
                recruitment.getIntroduction(),
                recruitment.getDescription(),
                recruitment.getSkill(),
                recruitment.getStartAt(),
                recruitment.getEndAt(),
                recruitment.getRecruitmentStatus(),
                recruitment.getRecruiterId(),
                recruitment.getHeadCount(),
                recruitment.getCreatedAt(),
                recruitment.getEditedAt(),
                recruitment.getDeletedAt(),
                recruitment.isDeleted()
        );
    }

    /**
     * 엔티티 -> 도메인 변환
     */
    public Recruitment toDomain(RecruitmentEntity entity) {
        if (entity == null) {
            return null;
        }

        return Recruitment.of(
                entity.getRecruitmentId(),
                entity.getTitle(),
                entity.getIntroduction(),
                entity.getDescription(),
                entity.getSkill(),
                entity.getStartAt(),
                entity.getEndAt(),
                entity.getRecruitmentStatus(),
                entity.getUserId(),
                entity.getHeadCount(),
                entity.getCreatedAt(),
                entity.getEditedAt(),
                entity.getDeletedAt(),
                entity.isDeleted()
        );
    }
}
