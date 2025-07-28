package com.goinmuls.sidehub.adapter.out.mongo.document;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@Document(collation = "latest_chat_message")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LatestChatMessageDocument {
    @Id
    private String id;

    @Field("chat_room_id")
    private String chatRoomId;  // 채팅방 아이디

    @Field("message")
    private String message;     // 최신 메세지

    @Field("unread_message_count")
    private int unreadMessageCount;    // 안 읽은 수

    @Field("created_at")
    private LocalDateTime createdAt;    // 생성 일시

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LatestChatMessageDocument that)) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
