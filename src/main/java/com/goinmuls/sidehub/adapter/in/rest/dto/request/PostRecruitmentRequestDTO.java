package com.goinmuls.sidehub.adapter.in.rest.dto.request;

import com.goinmuls.sidehub.domain.enums.RecruitmentStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import com.goinmuls.sidehub.domain.Recruitment;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostRecruitmentRequestDTO {
    private Long recruitmentId;
    private String name;
    private String introduction;
    private String description;
    private String skill;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private RecruitmentStatus recruitmentStatus;
    private String recruiterId;
    private int headCount;
    private LocalDateTime createdAt;
    private LocalDateTime editedAt;
    private LocalDateTime deletedAt;
    private boolean isDeleted;

    /**
     * DTO -> 도메인 객체 변환
     * @return Recruitment 도메인 객체
     */
    public Recruitment toDomain() {
        return Recruitment.of(
                recruitmentId,
                name,
                introduction,
                description,
                skill,
                startAt,
                endAt,
                recruitmentStatus,
                recruiterId,
                headCount,
                createdAt,
                editedAt,
                deletedAt,
                isDeleted
        );
    }
}
