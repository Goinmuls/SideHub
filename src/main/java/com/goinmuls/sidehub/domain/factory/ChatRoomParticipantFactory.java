package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomParticipantEntity;
import com.goinmuls.sidehub.domain.ChatRoomParticipant;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomParticipantFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param chatRoomParticipantEntity 엔티티
     * @return 도메인
     */
    public ChatRoomParticipant fromEntity(ChatRoomParticipantEntity chatRoomParticipantEntity) {
        if (chatRoomParticipantEntity == null) {
            return null;
        }

        return ChatRoomParticipant.of(
                chatRoomParticipantEntity.getChatRoomParticipantId(),
                chatRoomParticipantEntity.getChatRoomId(),
                chatRoomParticipantEntity.getMemberId(),
                chatRoomParticipantEntity.getRole(),
                chatRoomParticipantEntity.getKickerId(),
                chatRoomParticipantEntity.isKicked(),
                chatRoomParticipantEntity.isExited(),
                chatRoomParticipantEntity.getKickedAt(),
                chatRoomParticipantEntity.getExitedAt(),
                chatRoomParticipantEntity.getCreatedAt(),
                chatRoomParticipantEntity.getUpdatedAt()
        );
    }
}
