package com.goinmuls.sidehub.adapter.out.statistic.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PRIVATE)
@Table(name = "statistic")
@Getter
@Entity
public class StatisticEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statistic_id")
    @Comment("통계 id")
    private Long id;

    @Column(name = "member_id")
    @Comment("통계 대상 사용자 id")
    private Long memberId;

    @Column(name = "week_start")
    @Comment("통계 기준 주차 시작일")
    private LocalDate weekStart;

    @Column(name = "task_done_count")
    @Comment("완료한 태스크 수")
    private int taskDoneCount;

    @Column(name = "attendance_count")
    @Comment("출석일 수")
    private int attendanceCount;

    @Column(name = "contribution_score")
    @Comment("기여 점수")
    private int contributionScore;

    // 생성일시는 추후 나중에 공통 추출
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @Comment("생성 일시")
    private LocalDateTime createdAt;

    // 수정일시는 추후 나중에 공통 추출
    @LastModifiedDate
    @Column(name = "updated_at")
    @Comment("수정 일자")
    private LocalDateTime updatedAt;

    // factory method
    public static StatisticEntity of () {
        return StatisticEntity.builder().build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticEntity that = (StatisticEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
