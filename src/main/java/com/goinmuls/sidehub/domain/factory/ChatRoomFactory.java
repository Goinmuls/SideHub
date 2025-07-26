package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomEntity;
import com.goinmuls.sidehub.domain.ChatRoom;
import org.springframework.stereotype.Component;
@Component
public class ChatRoomFactory {

    /**
     * 엔티티 -> 도메인
     * @param chatRoomEntity 엔티티
     * @return 도메인
     */
    public ChatRoom fromEntity(ChatRoomEntity chatRoomEntity) {
        if (chatRoomEntity == null) {
            return null;
        }
        return ChatRoom.of(
                chatRoomEntity.getChatRoomId(), chatRoomEntity.getType(), chatRoomEntity.getName(),
                chatRoomEntity.isDeleted(), chatRoomEntity.getCreatedAt(), chatRoomEntity.getUpdatedAt()
        );
    }
}
