package com.goinmuls.sidehub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatInbox {
    private Long chatInboxId;
    private Long chatOutboxId;
    private String eventType;
    private String payload;
    private String topic;
    private LocalDateTime createdAt;
}
