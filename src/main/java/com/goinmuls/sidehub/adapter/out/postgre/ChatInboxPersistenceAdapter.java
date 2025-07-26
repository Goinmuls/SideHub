package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatInboxEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatInboxJpaRepository;
import com.goinmuls.sidehub.application.port.out.ChatInboxOutPort;
import com.goinmuls.sidehub.domain.ChatInbox;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.ChatInboxMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatInboxPersistenceAdapter implements ChatInboxOutPort {
    private ChatInboxJpaRepository chatInboxJpaRepository;
    private ChatInboxMapper chatInboxMapper;


    /**
     * 채팅 인박스 저장
     * @param chatInbox 채팅 인박스
     */
    @Override
    public void save(ChatInbox chatInbox) {
        ChatInboxEntity chatInboxEntity = chatInboxMapper.toEntity(chatInbox);
        chatInboxJpaRepository.save(chatInboxEntity);
    }
}
