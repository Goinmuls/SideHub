package com.goinmuls.sidehub.adapter.in.rest.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.PostRecruitmentResponseDTO;
import com.goinmuls.sidehub.domain.Recruitment;
import org.springframework.stereotype.Component;

/**
 * 도메인 ↔ DTO 변환
 */
@Component
public class PostRecruitmentResponseMapper {

    public PostRecruitmentResponseDTO toDto(Recruitment recruitment) {
        if (recruitment == null) {
            return null;
        }
        return PostRecruitmentResponseDTO.of(
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
}
