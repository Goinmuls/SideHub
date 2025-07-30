package com.goinmuls.sidehub.adapter.out.attendance.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class AttendanceEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    @Comment("출석 id")
    private Long id;

    @Column(name = "member_id")
    @Comment("출석 대상 사용자 id")
    private Long memberId;

    @CreatedDate
    @Column(name = "attendance_at", updatable = false)
    @Comment("출석 일시")
    private LocalDateTime attendanceAt;

    // 생성일시는 추후 나중에 공통 추출
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @Comment("생성 일시")
    private LocalDateTime createdAt;

    // factory method
    public static AttendanceEntity of(Long memberId) {
        return AttendanceEntity.builder()
                .id(null)
                .memberId(memberId)
                .attendanceAt(null)
                .createdAt(null)  // createdAt은 자동으로 넣어주니 null로 생성
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendanceEntity that = (AttendanceEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
