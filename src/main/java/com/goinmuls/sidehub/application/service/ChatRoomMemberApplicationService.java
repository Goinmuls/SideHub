package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMemberResponseDto;
import com.goinmuls.sidehub.application.port.in.FindChatRoomMemberUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomOutport;
import com.goinmuls.sidehub.domain.ChatRoomMember;
import com.goinmuls.sidehub.domain.factory.ChatRoomMemberFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomMemberApplicationService implements FindChatRoomMemberUseCase {
    private final ChatRoomOutport chatRoomOutport;
    private final ChatRoomMemberFactory chatRoomMemberFactory;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @Override
    public List<FindChatRoomMemberResponseDto> findAllByChatRoomId(Long chatRoomId) {
        List<ChatRoomMember> chatRoomMembers = chatRoomOutport.findAllByChatRoomId(chatRoomId);
        return chatRoomMembers.stream()
                .map(chatRoomMemberFactory::toFindDto)
                .toList();
    }
}
