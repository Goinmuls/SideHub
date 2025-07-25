package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.ChatMemberRole;
import jakarta.persistence.EnumType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoomMember {
    private Long chatRoomMemberId;
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

}
