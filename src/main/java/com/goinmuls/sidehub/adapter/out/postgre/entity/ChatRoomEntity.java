package com.goinmuls.sidehub.adapter.out.postgre.entity;

import com.goinmuls.sidehub.domain.enums.ChatRoomType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "chat_room")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoomEntity {
    @Id
    @Comment(value = "채팅방 아이디")
    @Column(name = "chat_room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatRoomId;

    @Comment(value = "채팅방 유형")
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ChatRoomType type;

    @Comment(value = "채팅방명")
    @Column(name = "name")
    private String name;

    @Comment(value = "삭제 여부")
    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Comment(value = "생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment(value = "수정 일시")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
