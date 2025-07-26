package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.ChatMemberRole;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoomParticipant {
    private Long chatRoomParticipantId;
    private Long chatRoomId;
    private Long memberId;
    private ChatMemberRole role;
    private Long kickerId;
    private boolean isKicked;
    private boolean isExited;
    private LocalDateTime kickedAt;
    private LocalDateTime exitedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ChatRoomParticipant of (
            Long chatRoomParticipantId, Long chatRoomId, Long memberId, ChatMemberRole role, Long kickerId,
            boolean isKicked, boolean isExited,
            LocalDateTime kickedAt, LocalDateTime exitedAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        return new ChatRoomParticipant(chatRoomParticipantId, chatRoomId, memberId, role, kickerId, isKicked, isExited, kickedAt, exitedAt, createdAt, updatedAt);
    }
}
