package com.goinmuls.sidehub.adapter.out.rankHistory.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PRIVATE)
@Table(name = "rank_history")
@Getter
@Entity
public class RankHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rank_history_id")
    @Comment("랭킹 히스토리 id")
    private Long id;

    @Column(name = "member_id")
    @Comment("히스토리 대상 사용자 id")
    private Long memberId;

    @Column(name = "week_start")
    @Comment("히스토리 기록 주차 시작일")
    private LocalDate weekStart;

    @Column(name = "contribution_score")
    @Comment("해당 주의 기여 점수")
    private int rankPosition;

    @Column(name = "contribution_score")
    @Comment("해당 주의 랭킹 순위")
    private int contributionScore;

    // 생성일시는 추후 나중에 공통 추출
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @Comment("생성 일시")
    private LocalDateTime createdAt;

    // factory method
    public static RankHistoryEntity of () {
        return RankHistoryEntity.builder().build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RankHistoryEntity that = (RankHistoryEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
