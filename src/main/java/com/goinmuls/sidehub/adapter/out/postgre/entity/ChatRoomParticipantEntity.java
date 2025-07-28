package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.ChatMemberRole;
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
@Table(name = "chat_room_]articipant")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoomParticipantEntity {
    @Id
    @Comment("채팅방 멤버 Id")
    @Column(name = "chat_room_participant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatRoomParticipantId;

    @Comment("채팅방 정보 id")
    @Column(name = "chat_room_id")
    private Long chatRoomId;

    @Comment("멤버 id")
    @Column(name = "member_id")
    private Long memberId;

    @Comment("역할")
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private ChatMemberRole role;

    @Comment("강퇴 여부")
    @Column(name = "kicker_id")
    private Long kickerId;

    @Comment("강퇴한 사용자 id")
    @Column(name = "is_kicked")
    private boolean isKicked;

    @Comment("퇴장 여부")
    @Column(name = "is_exited")
    private boolean isExited;

    @Comment("강퇴 일시")
    @Column(name = "kicked_at")
    private LocalDateTime kickedAt;

    @Comment("퇴장 일시")
    @Column(name = "exited_at")
    private LocalDateTime exitedAt;

    @Comment("입장 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정 일시")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatRoomParticipantEntity that)) return false;

        return chatRoomParticipantId.equals(that.chatRoomParticipantId);
    }

    @Override
    public int hashCode() {
        return chatRoomParticipantId.hashCode();
    }
}
