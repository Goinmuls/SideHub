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
}
