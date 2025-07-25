package com.goinmuls.sidehub.adapter.out.postgre.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "chat_room_message_file")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoomMessageFileEntity {
    @Id
    @Comment(value = "채팅방 메세지 첨부파일 아이디")
    @Column(name = "chat_room_message_file_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatRoomMessageFileId;

    @Comment(value = "채팅방 아이디")
    @Column(name = "chat_room_id")
    private Long chatRoomId;

    @Comment(value = "파일 메타 아이디")
    @Column(name = "file_meta_id")
    private Long fileMetaId;

    @Comment(value = "멤버 아이디")
    @Column(name = "member_id")
    private Long memberId;

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
