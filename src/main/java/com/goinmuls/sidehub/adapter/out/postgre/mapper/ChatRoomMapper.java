package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomResponseDto;
import com.goinmuls.sidehub.domain.ChatRoom;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ChatRoomMapper {

    /**
     * 도메인 -> 조회 응답 dto
     * @param chatRoom 도메인
     * @return 조회 응답 dto
     */
    public FindChatRoomResponseDto toFindResponseDto(ChatRoom chatRoom) {
        if (ObjectUtils.isEmpty(chatRoom)) {
            return null;
        }

        return FindChatRoomResponseDto.of(
                chatRoom.getChatRoomId(), chatRoom.getType(), chatRoom.getName(),
                chatRoom.isDeleted(), chatRoom.getCreatedAt(), chatRoom.getUpdatedAt()
        );
    }
}
