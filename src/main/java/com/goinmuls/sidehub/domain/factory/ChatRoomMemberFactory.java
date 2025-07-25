package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMemberResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomMemberEntity;
import com.goinmuls.sidehub.domain.ChatRoomMember;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ChatRoomMemberFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param chatRoomMemberEntity 엔티티
     * @return 도메인
     */
    public ChatRoomMember fromEntity(ChatRoomMemberEntity chatRoomMemberEntity) {
        if (ObjectUtils.isEmpty(chatRoomMemberEntity)) {
            return null;
        }

        return ChatRoomMember.of(
                chatRoomMemberEntity.getChatRoomMemberId(),
                chatRoomMemberEntity.getChatRoomId(),
                chatRoomMemberEntity.getMemberId(),
                chatRoomMemberEntity.getRole(),
                chatRoomMemberEntity.getKickerId(),
                chatRoomMemberEntity.isKicked(),
                chatRoomMemberEntity.isExited(),
                chatRoomMemberEntity.getKickedAt(),
                chatRoomMemberEntity.getExitedAt(),
                chatRoomMemberEntity.getCreatedAt(),
                chatRoomMemberEntity.getUpdatedAt()
        );
    }

    /**
     * 도메인 -> 조회 응답 dto
     * @param chatRoomMember 도메인
     * @return 조회 응답 dto
     */
    public FindChatRoomMemberResponseDto toFindDto(ChatRoomMember chatRoomMember) {
        if (ObjectUtils.isEmpty(chatRoomMember)) {
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
