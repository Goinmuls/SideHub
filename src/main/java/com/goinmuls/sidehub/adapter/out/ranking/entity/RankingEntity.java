package com.goinmuls.sidehub.adapter.out.ranking.entity;

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
@Table(name = "ranking")
@Getter
@Entity
public class RankingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ranking_id")
    @Comment("랭킹 id")
    private Long id;

    @Column(name = "member_id")
    @Comment("랭킹 대상 사용자 id")
    private Long memberId;

    @Column(name = "week_start")
    @Comment("랭킹 기준 주차 시작일")
    private LocalDate weekStart;

    @Column(name = "rank_position")
    @Comment("랭킹 순위")
    private int rankPosition;

    @Column(name = "rank_change")
    @Comment("랭킹 변동")
    private int rankChange;

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
    public static RankingEntity of () {
        return RankingEntity.builder().build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RankingEntity that = (RankingEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
