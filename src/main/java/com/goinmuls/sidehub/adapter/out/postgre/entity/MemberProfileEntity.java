package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.MemberProfileType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Table(name = "member_profile")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberProfileEntity {
    @Id
    @Comment("멤버 프로필 아이디")
    @Column(name = "member_profile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberProfileId;

    @Comment("파일 메타 아이디")
    @Column(name = "file_meta_id")
    private Long fileMetaId;

    @Comment("멤버 아이디")
    @Column(name = "member_id")
    private Long memberId;

    @Comment("멤버 프로플 유형")
    @Column(name = "member_profile_type")
    @Enumerated(EnumType.STRING)
    private MemberProfileType memberProfileType;

    @Comment("삭제 여부")
    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Comment("생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정 일시")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Comment("삭제 일시")
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberProfileEntity that)) return false;

        return memberProfileId.equals(that.memberProfileId);
    }

    @Override
    public int hashCode() {
        return memberProfileId.hashCode();
    }
}
