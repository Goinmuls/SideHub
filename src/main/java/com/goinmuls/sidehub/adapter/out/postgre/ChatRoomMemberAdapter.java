package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatRoomMemberRepository;
import com.goinmuls.sidehub.application.port.out.FindChatRoomOutport;
import com.goinmuls.sidehub.domain.ChatRoomMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChatRoomMemberAdapter implements FindChatRoomOutport {
    private final ChatRoomMemberRepository chatRoomMemberRepository;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @Override
    public List<ChatRoomMember> findAllByChatRoomId(Long chatRoomId) {
        return chatRoomMemberRepository.findAllByChatRoomId(chatRoomId);
    }
}
