package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMemberResponseDto;
import com.goinmuls.sidehub.domain.ChatRoomMember;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomMemberMapper {

    /**
     * 도메인 -> 조회 응답 dto
     * @param chatRoomMember 도메인
     * @return 조회 응답 dto
     */
    public FindChatRoomMemberResponseDto toFindResponseDto(ChatRoomMember chatRoomMember) {
        if (chatRoomMember == null) {
            return null;
        }

        return FindChatRoomMemberResponseDto.of(
                chatRoomMember.getChatRoomMemberId(),
                chatRoomMember.getChatRoomId(),
                chatRoomMember.getMemberId(),
                chatRoomMember.getRole(),
                chatRoomMember.getKickerId(),
                chatRoomMember.isKicked(),
                chatRoomMember.isExited(),
                chatRoomMember.getKickedAt(),
                chatRoomMember.getExitedAt(),
                chatRoomMember.getCreatedAt(),
                chatRoomMember.getUpdatedAt()
        );
    }
}
