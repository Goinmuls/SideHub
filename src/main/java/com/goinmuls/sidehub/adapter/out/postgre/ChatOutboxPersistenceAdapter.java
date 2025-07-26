package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatOutboxEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatOutboxJpaRepository;
import com.goinmuls.sidehub.application.port.out.ChatOutboxOutPort;
import com.goinmuls.sidehub.domain.ChatOutbox;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.ChatOutboxMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatOutboxPersistenceAdapter implements ChatOutboxOutPort {
    private ChatOutboxJpaRepository chatOutboxJpaRepository;
    private ChatOutboxMapper chatOutboxMapper;

    /**
     * 채팅 아웃박스 저장
     * @param chatOutbox 채팅 아웃박스
     */
    @Override
    public void save(ChatOutbox chatOutbox) {
        ChatOutboxEntity chatOutboxEntity = chatOutboxMapper.toEntity(chatOutbox);
        chatOutboxJpaRepository.save(chatOutboxEntity);
    }
}
