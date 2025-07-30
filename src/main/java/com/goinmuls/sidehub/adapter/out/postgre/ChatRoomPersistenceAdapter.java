package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatRoomJpaRepository;
import com.goinmuls.sidehub.application.port.out.ChatRoomOutPort;
import com.goinmuls.sidehub.domain.ChatRoom;
import com.goinmuls.sidehub.domain.factory.ChatRoomFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatRoomPersistenceAdapter implements ChatRoomOutPort {
    private final ChatRoomJpaRepository chatRoomJpaRepository;
    private final ChatRoomFactory chatRoomFactory;

    /**
     * 채팅방 조회
     * @param id 아이디
     * @return 채팅방
     */
    @Override
    public ChatRoom findById(Long id) {
        ChatRoomEntity chatRoomEntity = chatRoomJpaRepository.findById(id).orElse(null);
        return chatRoomFactory.fromEntity(chatRoomEntity);
    }
}
