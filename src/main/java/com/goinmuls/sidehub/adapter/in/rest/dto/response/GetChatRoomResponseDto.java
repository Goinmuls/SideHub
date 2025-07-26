package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import com.goinmuls.sidehub.domain.enums.ChatRoomType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GetChatRoomResponseDto {
    private Long chatRoomId;
    private ChatRoomType type;
    private String name;
    private boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static GetChatRoomResponseDto of (
            Long chatRoomId, ChatRoomType type, String name,
            boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new GetChatRoomResponseDto(chatRoomId, type, name, isDeleted, createdAt, updatedAt);
    }
}
