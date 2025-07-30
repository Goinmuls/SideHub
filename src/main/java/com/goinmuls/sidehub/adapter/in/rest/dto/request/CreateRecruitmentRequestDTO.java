package com.goinmuls.sidehub.adapter.in.rest.dto.request;

import com.goinmuls.sidehub.domain.enums.RecruitmentStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateRecruitmentRequestDTO {
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
}
