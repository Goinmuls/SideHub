package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatMessageFile {
    private Long chatMessageFileId;
    private Long chatRoomId;
    private Long fileMetaId;
    private Long memberId;
    private boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ChatMessageFile of (
            Long chatMessageFileId, Long chatRoomId, Long fileMetaId, Long memberId,
            boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new ChatMessageFile(chatMessageFileId, chatRoomId, fileMetaId, memberId, isDeleted, createdAt, updatedAt);
    }
}
