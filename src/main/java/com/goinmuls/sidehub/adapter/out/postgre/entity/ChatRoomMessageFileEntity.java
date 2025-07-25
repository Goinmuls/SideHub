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
    @Comment("채팅방 메세지 첨부파일 아이디")
    @Column(name = "chat_room_message_file_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatRoomMessageFileId;

    @Comment("채팅방 아이디")
    @Column(name = "chat_room_id")
    private Long chatRoomId;

    @Comment("파일 메타 아이디")
    @Column(name = "file_meta_id")
    private Long fileMetaId;

    @Comment("멤버 아이디")
    @Column(name = "member_id")
    private Long memberId;

    @Comment("삭제 여부")
    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Comment("생성 일시")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("삭제 일시")
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
