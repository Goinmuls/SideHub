package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomEntity;
import com.goinmuls.sidehub.domain.ChatRoom;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ChatRoomFactory {

    /**
     * 엔티티 -> 도메인
     * @param chatRoomEntity 엔티티
     * @return 도메인
     */
    public ChatRoom fromEntity(ChatRoomEntity chatRoomEntity) {
        if (ObjectUtils.isEmpty(chatRoomEntity)) {
            return null;
        }
        return ChatRoom.of(
                chatRoomEntity.getChatRoomId(), chatRoomEntity.getType(), chatRoomEntity.getName(),
                chatRoomEntity.isDeleted(), chatRoomEntity.getCreatedAt(), chatRoomEntity.getUpdatedAt()
        );
    }

    /**
     * 도메인 -> 조회 응답 dto
     * @param chatRoom 도메인
     * @return 조회 응답 dto
     */
    public FindChatRoomResponseDto toFindDto(ChatRoom chatRoom) {
        if (ObjectUtils.isEmpty(chatRoom)) {
            return null;
        }

        return FindChatRoomResponseDto.of(
                chatRoom.getChatRoomId(), chatRoom.getType(), chatRoom.getName(),
                chatRoom.isDeleted(), chatRoom.getCreatedAt(), chatRoom.getUpdatedAt()
        );
    }
}
