package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatInboxEntity;
import com.goinmuls.sidehub.domain.ChatInbox;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ChatInboxMapper {

    /**
     * 도메인 -> 엔티티 변환
     * @param chatInbox 도메인
     * @return 엔티티
     */
    public ChatInboxEntity toEntity(ChatInbox chatInbox) {
        if (ObjectUtils.isEmpty(chatInbox)) {
            return null;
        }

        return ChatInboxEntity.of(
                chatInbox.getChatInboxId(),
                chatInbox.getChatOutboxId(),
                chatInbox.getEventType(),
                chatInbox.getPayload(),
                chatInbox.getTopic(),
                chatInbox.getCreatedAt()
        );
    }
}
