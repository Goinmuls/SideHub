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
    private String chatRoomId;
    private String senderId;
    private ChatMessageType chatMessageType;
    private String content;
    private List<String> readByUsers;
    private List<ChatFile> chatFiles;
    private boolean isDeleted;
    private ChatMessageDeleteType deleteType;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    public static SendChatMessageResponseDto of(
        String id, String chatRoomId, String senderId, ChatMessageType chatMessageType, String content,
        List<String> readByUsers, List<ChatFile> chatFiles,  boolean isDeleted, ChatMessageDeleteType deleteType,
        LocalDateTime createdAt, LocalDateTime deletedAt
    ) {
        return new SendChatMessageResponseDto(
                id, chatRoomId, senderId, chatMessageType, content,
                readByUsers, chatFiles, isDeleted, deleteType, createdAt, deletedAt
        );
    }
}
