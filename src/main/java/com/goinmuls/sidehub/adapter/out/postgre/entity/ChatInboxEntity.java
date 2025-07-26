package com.goinmuls.sidehub.adapter.out.postgre.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Table(name = "chat_inbox")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatInboxEntity {
    @Id
    @Comment("채팅 인박스 아이디")
    @Column(name = "chat_inbox_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatInboxId;

    @Comment("채팅 아웃박스 아이디(메세지 식별용)")
    @Column(name = "chat_outbox_id")
    private Long chatOutboxId;

    @Comment("이벤트 유형")
    @Column(name = "event_type")
    private String eventType;

    @Comment("이벤트 데이터")
    @Column(name = "payload", columnDefinition = "LONGTEXT")
    private String payload;

    @Comment("카프카 토픽명")
    @Column(name = "topic")
    private String topic;

    @Comment("생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public static ChatInboxEntity of(
            Long chatInboxId, Long chatOutboxId, String eventType, String payload,
            String topic, LocalDateTime createdAt
    ) {
        return new ChatInboxEntity(chatInboxId, chatOutboxId, eventType, payload, topic, createdAt);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ChatInboxEntity that)) return false;
        return Objects.equals(chatInboxId, that.chatInboxId) && Objects.equals(chatOutboxId, that.chatOutboxId) && Objects.equals(eventType, that.eventType) && Objects.equals(payload, that.payload) && Objects.equals(topic, that.topic) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatInboxId, chatOutboxId, eventType, payload, topic, createdAt);
    }
}
