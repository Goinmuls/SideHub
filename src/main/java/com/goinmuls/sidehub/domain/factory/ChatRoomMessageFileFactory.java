package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomMessageFileEntity;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomMessageFileFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param chatRoomMessageFileEntity 엔티티
     * @return 도메인
     */
    public ChatRoomMessageFile fromEntity(ChatRoomMessageFileEntity chatRoomMessageFileEntity) {
        if (chatRoomMessageFileEntity == null) {
            return null;
        }

        return ChatRoomMessageFile.of(
                chatRoomMessageFileEntity.getChatRoomMessageFileId(),
                chatRoomMessageFileEntity.getChatRoomId(),
                chatRoomMessageFileEntity.getFileMetaId(),
                chatRoomMessageFileEntity.getMemberId(),
                chatRoomMessageFileEntity.isDeleted(),
                chatRoomMessageFileEntity.getCreatedAt(),
                chatRoomMessageFileEntity.getDeletedAt()
        );
    }
}
