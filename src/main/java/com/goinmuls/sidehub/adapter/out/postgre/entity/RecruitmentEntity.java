package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.RecruitmentStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "recruitment")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RecruitmentEntity {

    @Id
    @Comment("모집 공고 id")
    @Column(name = "recruitment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recruitmentId;

    @Comment("공고명")
    @Column(name = "name")
    private String name;

    @Comment("한 줄 소개")
    @Column(name = "introduction")
    private String introduction;

    @Comment("상세 설명")
    @Column(name = "description")
    private String description;

    @Comment("기술")
    @Column(name = "skill")
    private String skill;

    @Comment("시작일")
    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Comment("마감일")
    @Column(name = "end_at")
    private LocalDateTime endAt;

    @Comment("공고 모집 상태")
    @Column(name = "status")
    private RecruitmentStatus recruitmentStatus;

    @Comment("생성자 이름")
    @Column(name = "recruiter_name")
    private String recruiterName;

    @Comment("총 채용 인원")
    @Column(name = "head_count")
    private int headCount;

    @Comment("생성 시간")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정 시간")
    @Column(name = "edited_at")
    private LocalDateTime editedAt;

    @Comment("삭제 시간")
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Comment("삭제 여부")
    @Column(name = "is_deleted")
    private boolean isDeleted;

    public static RecruitmentEntity of(
            Long recruitmentId, String name, String introduction,
            String description, String skill, LocalDateTime startAt, LocalDateTime endAt,
            RecruitmentStatus recruitmentStatus, String recruiterName, int headCount,
            LocalDateTime createdAt, LocalDateTime editedAt, LocalDateTime deletedAt,
            boolean isDeleted
    ) {
        return new RecruitmentEntity(
                recruitmentId, name, introduction, description,
                skill, startAt, endAt, recruitmentStatus, recruiterName,
                headCount, createdAt, editedAt, deletedAt, isDeleted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof RecruitmentEntity that)) {
            return false;
        }

        if (recruitmentId == null) {
            return false;
        }

        return recruitmentId.equals(that.recruitmentId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}