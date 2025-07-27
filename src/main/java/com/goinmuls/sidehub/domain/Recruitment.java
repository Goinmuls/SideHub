package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.RecruitmentStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Recruitment {
    private Long recruitmentId;
    private String name;
    private String introduction;
    private String description;
    private String skill;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private RecruitmentStatus recruitmentStatus;
    private String recruiterName;
    private int headCount;
    private LocalDateTime createdAt;
    private LocalDateTime editedAt;
    private LocalDateTime deletedAt;
    private boolean isDeleted;

    public static Recruitment of(
            Long recruitmentId, String name, String introduction,
            String description, String skill, LocalDateTime startAt,
            LocalDateTime endAt, RecruitmentStatus recruitmentStatus, String recruiterName,
            int headCount, LocalDateTime createdAt, LocalDateTime editedAt,
            LocalDateTime deletedAt, boolean isDeleted
    ) {
        return new Recruitment(
                recruitmentId, name, introduction,
                description, skill, startAt, endAt,
                recruitmentStatus, recruiterName, headCount,
                createdAt, editedAt, deletedAt, isDeleted
        );
    }
}
