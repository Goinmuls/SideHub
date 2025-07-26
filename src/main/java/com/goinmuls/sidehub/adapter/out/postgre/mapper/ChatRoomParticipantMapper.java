package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMemberResponseDto;
import com.goinmuls.sidehub.domain.ChatRoomParticipant;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomParticipantMapper {

    /**
     * 도메인 -> 조회 응답 dto
     * @param chatRoomParticipant 도메인
     * @return 조회 응답 dto
     */
    public FindChatRoomMemberResponseDto toFindResponseDto(ChatRoomParticipant chatRoomParticipant) {
        if (chatRoomParticipant == null) {
            return null;
        }

        return FindChatRoomMemberResponseDto.of(
                chatRoomParticipant.getChatRoomParticipantId(),
                chatRoomParticipant.getChatRoomId(),
                chatRoomParticipant.getMemberId(),
                chatRoomParticipant.getRole(),
                chatRoomParticipant.getKickerId(),
                chatRoomParticipant.isKicked(),
                chatRoomParticipant.isExited(),
                chatRoomParticipant.getKickedAt(),
                chatRoomParticipant.getExitedAt(),
                chatRoomParticipant.getCreatedAt(),
                chatRoomParticipant.getUpdatedAt()
        );
    }
}
