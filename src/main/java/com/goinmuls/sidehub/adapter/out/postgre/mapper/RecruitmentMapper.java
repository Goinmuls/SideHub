package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.RecruitmentResponseDTO;
import com.goinmuls.sidehub.domain.Recruitment;
import org.springframework.stereotype.Component;

@Component
public class RecruitmentMapper {

    /**
     * 도메인 -> 조회 DTO
     * @param recruitment 도메인
     * @return 조회 DTO
     */
    public RecruitmentResponseDTO toRecruitmentResponseDTO(Recruitment recruitment) {
        if (recruitment == null) {
            return null;
        }

        return RecruitmentResponseDTO.of(
                recruitment.getRecruitmentId(), recruitment.getName(),
                recruitment.getIntroduction(), recruitment.getDescription(),
                recruitment.getSkill(), recruitment.getStartAt(), recruitment.getEndAt(),
                recruitment.getRecruitmentStatus(), recruitment.getRecruiterId(),
                recruitment.getHeadCount(), recruitment.getCreatedAt(),
                recruitment.getEditedAt(), recruitment.getDeletedAt(),
                recruitment.isDeleted()
        );
    }
}