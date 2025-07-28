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
    private Long chatRoomId;  // 채팅방 아이디

    @Field("sender_id")
    private Long senderId;    // 보낸 사람 아이디

    @Field("chat_message_type")
    private ChatMessageType chatMessageType;    // 채팅 타입

    @Field("content")
    private String content;     // 채팅 내용

    @Field("read_by_users")
    private List<Long> readByUsers;   // 읽은 사람 아아디 목록

    @Field("chat_file")
    private List<ChatFile> chatFiles;   // 채팅 파일 목록

    @Field("is_deleted")
    private boolean isDeleted;          // 삭제 여부

    @Field("delete_type")
    private ChatMessageDeleteType deleteType;   // 삭제 유형

    @Field("created_at")
    private LocalDateTime createdAt;    // 생성 일시

    @Field("deleted_at")
    private LocalDateTime deletedAt;

    public static ChatMessageDocument of(
            String id, Long chatRoomId, Long senderId, ChatMessageType chatMessageType, String content,
            List<Long> readByUsers, List<ChatFile> chatFiles, boolean isDeleted, ChatMessageDeleteType deleteType,
            LocalDateTime createdAt, LocalDateTime deletedAt
    ) {
        return new ChatMessageDocument(
                id, chatRoomId, senderId, chatMessageType, content,
                readByUsers, chatFiles, isDeleted, deleteType, createdAt, deletedAt
        );
    }

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
