package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatOutboxEntity;
import com.goinmuls.sidehub.domain.ChatOutbox;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ChatOutboxFactory {

    /**
     * 도메인 -> 엔티티 변환
     * @param chatOutbox 도메인
     * @return 엔티티
     */
    public ChatOutboxEntity toEntity(ChatOutbox chatOutbox) {
        if (ObjectUtils.isEmpty(chatOutbox)) {
            return null;
        }

        return ChatOutboxEntity.of(
                chatOutbox.getChatOutboxId(),
                chatOutbox.getPayload(),
                chatOutbox.getEventType(),
                chatOutbox.getStatus(),
                chatOutbox.getTopic(),
                chatOutbox.getCreatedAt(),
                chatOutbox.getUpdatedAt()
        );
    }
}
