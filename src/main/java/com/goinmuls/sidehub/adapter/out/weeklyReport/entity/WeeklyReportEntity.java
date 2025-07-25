package com.goinmuls.sidehub.adapter.out.weeklyReport.entity;

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
@Table(name = "weekly_report")
@Getter
@Entity
public class WeeklyReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    @Comment("주간 리포트 id")
    private Long id;

    @Column(name = "member_id")
    @Comment("리포트 대상 사용자 id")
    private Long memberId;

    @Column(name = "week_start")
    @Comment("리포트 발송 기준 주차 시작일")
    private LocalDate weekStart;

    @Column(name = "sent_at", updatable = false)
    @Comment("리포트 발송 시각")
    private LocalDateTime sentAt;

    // 추후 enum으로 변경
    @Column(name = "status", updatable = false)
    @Comment("리포트 발송 상태")
    private String status;

    // 추후 enum으로 변경
    @Column(name = "channel", updatable = false)
    @Comment("리포트 발송 채널")
    private String channel;

    // 생성일시는 추후 나중에 공통 추출
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @Comment("생성 일시")
    private LocalDateTime createdAt;

    // factory method
    public static WeeklyReportEntity of(Long memberId, LocalDate weekStart, LocalDateTime sentAt, String status, String channel) {
        return WeeklyReportEntity.builder()
                .id(null)
                .memberId(memberId)
                .weekStart(weekStart)
                .sentAt(sentAt)
                .status(status)
                .channel(channel)
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeeklyReportEntity that = (WeeklyReportEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
