package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatRoomMemberJpaRepository;
import com.goinmuls.sidehub.application.port.out.ChatRoomMemberOutport;
import com.goinmuls.sidehub.domain.ChatRoomMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChatRoomMemberPersistenceAdapter implements ChatRoomMemberOutport {
    private final ChatRoomMemberJpaRepository chatRoomMemberJpaRepository;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @Override
    public List<ChatRoomMember> findAllByChatRoomId(Long chatRoomId) {
        return chatRoomMemberJpaRepository.findAllByChatRoomId(chatRoomId);
    }
}
