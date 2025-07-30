package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.ChatRoomType;
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
@Table(name = "chat_room")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoomEntity {
    @Id
    @Comment( "채팅방 아이디")
    @Column(name = "chat_room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatRoomId;

    @Comment("채팅방 유형")
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ChatRoomType type;

    @Comment("채팅방명")
    @Column(name = "name")
    private String name;

    @Comment("삭제 여부")
    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Comment("생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정 일시")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatRoomEntity that)) return false;

        return chatRoomId.equals(that.chatRoomId);
    }

    @Override
    public int hashCode() {
        return chatRoomId.hashCode();
    }
}
