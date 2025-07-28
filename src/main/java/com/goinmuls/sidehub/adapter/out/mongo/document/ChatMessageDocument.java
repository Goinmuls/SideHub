package com.goinmuls.sidehub.adapter.out.mongo.document;

import com.goinmuls.sidehub.domain.ChatFile;
import com.goinmuls.sidehub.domain.enums.ChatMessageDeleteType;
import com.goinmuls.sidehub.domain.enums.ChatMessageType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Document(collation = "chat_message")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatMessageDocument {
    @Id
    private String id;

    @Field("chat_room_id")
    private String chatRoomId;  // 채팅방 아이디

    @Field("sender_id")
    private String senderId;    // 보낸 사람 아이디

    @Field("chat_message_type")
    private ChatMessageType chatMessageType;    // 채팅 타입

    @Field("content")
    private String content;     // 채팅 내용

    @Field("read_by_users")
    private List<String> readByUsers;   // 읽은 사람 아아디 목록

    @Field("chat_file")
    private List<ChatFile> chatFiles;   // 채팅 파일 목록

    @Field("is_deleted")
    private boolean isDeleted;

    @Field("delete_type")
    private ChatMessageDeleteType deleteType;

    @Field("created_at")
    private LocalDateTime createdAt;    // 생성 일시

    @Field("deleted_at")
    private LocalDateTime deletedAt;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ChatMessageDocument that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
