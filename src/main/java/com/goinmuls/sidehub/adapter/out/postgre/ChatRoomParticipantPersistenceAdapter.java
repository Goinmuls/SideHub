package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomParticipantEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatRoomParticipantJpaRepository;
import com.goinmuls.sidehub.application.port.out.ChatRoomParticipantOutPort;
import com.goinmuls.sidehub.domain.ChatRoomParticipant;
import com.goinmuls.sidehub.domain.factory.ChatRoomParticipantFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChatRoomParticipantPersistenceAdapter implements ChatRoomParticipantOutPort {
    private final ChatRoomParticipantJpaRepository chatRoomParticipantJpaRepository;
    private final ChatRoomParticipantFactory chatRoomParticipantFactory;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @Override
    public List<ChatRoomParticipant> findAllByChatRoomId(Long chatRoomId) {
        List<ChatRoomParticipantEntity> chatRoomParticipantEntityList = chatRoomParticipantJpaRepository.findAllByChatRoomId(chatRoomId);
        return chatRoomParticipantEntityList.stream()
                .map(chatRoomParticipantFactory::fromEntity)
                .toList();
    }
}
