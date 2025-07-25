package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FindChatRoomMessageFileResponseDto {
    private Long chatRoomMessageFileId;
    private Long chatRoomId;
    private Long fileMetaId;
    private Long memberId;
    private boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static FindChatRoomMessageFileResponseDto of (
            Long chatRoomMessageFileId, Long chatRoomId, Long fileMetaId, Long memberId,
            boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new FindChatRoomMessageFileResponseDto(chatRoomMessageFileId, chatRoomId, fileMetaId, memberId, isDeleted, createdAt, updatedAt);
    }
}
