package com.goinmuls.sidehub.adapter.in.rest.dto.response;

import com.goinmuls.sidehub.domain.ChatFile;
import com.goinmuls.sidehub.domain.enums.ChatMessageDeleteType;
import com.goinmuls.sidehub.domain.enums.ChatMessageType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SendChatMessageResponseDto {
    private String id;
    private Long chatRoomId;
    private Long senderId;
    private ChatMessageType chatMessageType;
    private String content;
    private List<Long> readByUsers;
    private List<ChatFile> chatFiles;
    private boolean isDeleted;
    private ChatMessageDeleteType deleteType;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    public static SendChatMessageResponseDto of(
        String id, Long chatRoomId, Long senderId, ChatMessageType chatMessageType, String content,
        List<Long> readByUsers, List<ChatFile> chatFiles,  boolean isDeleted, ChatMessageDeleteType deleteType,
        LocalDateTime createdAt, LocalDateTime deletedAt
    ) {
        return new SendChatMessageResponseDto(
                id, chatRoomId, senderId, chatMessageType, content,
                readByUsers, chatFiles, isDeleted, deleteType, createdAt, deletedAt
        );
    }
}
