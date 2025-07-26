package com.goinmuls.sidehub.domain;

import com.goinmuls.sidehub.domain.enums.MessageStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChatOutbox {
    private Long chatOutboxId;
    private String payload;
    private String eventType;
    private MessageStatus status;
    private String topic;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ChatOutbox of(
        Long chatOutboxId, String payload, String eventType,
        MessageStatus status, String topic, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new ChatOutbox(chatOutboxId, payload, eventType, status, topic, createdAt, updatedAt);
    }
}
