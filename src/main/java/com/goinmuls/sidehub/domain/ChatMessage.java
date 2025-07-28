package com.goinmuls.sidehub.domain;

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
public class ChatMessage {
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
}
