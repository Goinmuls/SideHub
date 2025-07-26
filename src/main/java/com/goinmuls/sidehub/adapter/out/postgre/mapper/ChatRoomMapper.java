package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomResponseDto;
import com.goinmuls.sidehub.domain.ChatRoom;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomMapper {

    /**
     * 도메인 -> 조회 응답 dto
     * @param chatRoom 도메인
     * @return 조회 응답 dto
     */
    public GetChatRoomResponseDto toFindResponseDto(ChatRoom chatRoom) {
        if (chatRoom == null) {
            return null;
        }

        return GetChatRoomResponseDto.of(
                chatRoom.getChatRoomId(), chatRoom.getType(), chatRoom.getName(),
                chatRoom.isDeleted(), chatRoom.getCreatedAt(), chatRoom.getUpdatedAt()
        );
    }
}
