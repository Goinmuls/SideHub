package com.goinmuls.sidehub.adapter.in.rest.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.PostRecruitmentRequestDTO;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.PostRecruitmentResponseDTO;
import com.goinmuls.sidehub.adapter.out.postgre.entity.RecruitmentEntity;
import com.goinmuls.sidehub.domain.Recruitment;
import org.springframework.stereotype.Component;

/**
 * 도메인 ↔ DTO 변환
 */
@Component
public class Mapper {

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

    public Recruitment toDomain(PostRecruitmentRequestDTO postRecruitmentRequestDTO) {

        if (postRecruitmentRequestDTO == null) {
            return null;
        }

        return Recruitment.of(
                postRecruitmentRequestDTO.getRecruitmentId(),
                postRecruitmentRequestDTO.getName(),
                postRecruitmentRequestDTO.getIntroduction(),
                postRecruitmentRequestDTO.getDescription(),
                postRecruitmentRequestDTO.getSkill(),
                postRecruitmentRequestDTO.getStartAt(),
                postRecruitmentRequestDTO.getEndAt(),
                postRecruitmentRequestDTO.getRecruitmentStatus(),
                postRecruitmentRequestDTO.getRecruiterId(),
                postRecruitmentRequestDTO.getHeadCount(),
                postRecruitmentRequestDTO.getCreatedAt(),
                postRecruitmentRequestDTO.getEditedAt(),
                postRecruitmentRequestDTO.getDeletedAt(),
                postRecruitmentRequestDTO.isDeleted()
        );
    }

    public RecruitmentEntity toEntity(PostRecruitmentResponseDTO postRecruitmentResponseDTO) {

        if (postRecruitmentResponseDTO == null) {
            return null;
        }

        return RecruitmentEntity.of(
                postRecruitmentResponseDTO.getRecruitmentId(),
                postRecruitmentResponseDTO.getName(),
                postRecruitmentResponseDTO.getIntroduction(),
                postRecruitmentResponseDTO.getDescription(),
                postRecruitmentResponseDTO.getSkill(),
                postRecruitmentResponseDTO.getStartAt(),
                postRecruitmentResponseDTO.getEndAt(),
                postRecruitmentResponseDTO.getRecruitmentStatus(),
                postRecruitmentResponseDTO.getRecruiterId(),
                postRecruitmentResponseDTO.getHeadCount(),
                postRecruitmentResponseDTO.getCreatedAt(),
                postRecruitmentResponseDTO.getEditedAt(),
                postRecruitmentResponseDTO.getDeletedAt(),
                postRecruitmentResponseDTO.isDeleted()
        );
    }
}
