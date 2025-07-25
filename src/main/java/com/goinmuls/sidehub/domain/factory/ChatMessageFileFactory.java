package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatMessageFileEntity;
import com.goinmuls.sidehub.domain.ChatMessageFile;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageFileFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param chatMessageFileEntity 엔티티
     * @return 도메인
     */
    public ChatMessageFile fromEntity(ChatMessageFileEntity chatMessageFileEntity) {
        return ChatMessageFile.of(
                chatMessageFileEntity.getChatMessageFileId(),
                chatMessageFileEntity.getChatRoomId(),
                chatMessageFileEntity.getFileMetaId(),
                chatMessageFileEntity.getMemberId(),
                chatMessageFileEntity.isDeleted(),
                chatMessageFileEntity.getCreatedAt(),
                chatMessageFileEntity.getUpdatedAt()
        );
    }
}
