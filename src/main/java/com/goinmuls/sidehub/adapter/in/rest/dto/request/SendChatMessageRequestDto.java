package com.goinmuls.sidehub.adapter.in.rest.dto.request;

import com.goinmuls.sidehub.domain.ChatFile;
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
public class SendChatMessageRequestDto {
    private String chatRoomId;
    private String senderId;
    private ChatMessageType chatMessageType;
    private String content;
    private List<ChatFile> chatFiles;
    private LocalDateTime createdAt;

    public static SendChatMessageRequestDto of(
            String chatRoomId, String senderId, ChatMessageType chatMessageType, String content,
            List<ChatFile> chatFiles, LocalDateTime createdAt
    ) {
        return new SendChatMessageRequestDto(
                chatRoomId, senderId, chatMessageType, content, chatFiles, createdAt
        );
    }
}
