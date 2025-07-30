package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import com.goinmuls.sidehub.domain.enums.RecruitmentStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import com.goinmuls.sidehub.domain.Recruitment;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostRecruitmentResponseDTO {
    private Long recruitmentId;
    private String title;
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

    public static PostRecruitmentResponseDTO of(
            Long recruitmentId, String title, String introduction,
            String description, String skill, LocalDateTime startAt, LocalDateTime endAt,
            RecruitmentStatus recruitmentStatus, String recruiterId, int headCount,
            LocalDateTime createdAt, LocalDateTime editedAt, LocalDateTime deletedAt,
            boolean isDeleted
    ) {
        return new PostRecruitmentResponseDTO(
                recruitmentId, title, introduction, description,
                skill, startAt, endAt, recruitmentStatus, recruiterId,
                headCount, createdAt, editedAt, deletedAt, isDeleted
        );
    }
}
