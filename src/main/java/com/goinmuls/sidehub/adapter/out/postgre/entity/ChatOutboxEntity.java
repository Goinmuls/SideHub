package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.MessageStatus;
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
@Table(name = "chat_outbox")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatOutboxEntity {
    @Id
    @Comment("채팅 아웃박스 아이디")
    @Column(name = "chat_outbox_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatOutboxId;

    @Comment("이벤트 유형")
    @Column(name = "event_type")
    private String eventType;

    @Comment("이벤트 데이터")
    @Column(name = "payload", columnDefinition = "LONGTEXT")
    private String payload;

    @Comment("메세지 상태")
    @Column(name = "status")
    private MessageStatus status;

    @Comment("카프카 토픽명")
    @Column(name = "topic")
    private String topic;

    @Comment("생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정 일시")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public static ChatOutboxEntity of(
            Long chatOutboxId, String payload, String eventType,
            MessageStatus status, String topic, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new ChatOutboxEntity(chatOutboxId, payload, eventType, status, topic, createdAt, updatedAt);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatOutboxEntity that)) return false;

        return chatOutboxId.equals(that.chatOutboxId);
    }

    @Override
    public int hashCode() {
        return chatOutboxId.hashCode();
    }
}
