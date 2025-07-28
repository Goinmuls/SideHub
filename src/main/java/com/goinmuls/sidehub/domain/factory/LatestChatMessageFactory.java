package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.mongo.document.LatestChatMessageDocument;
import com.goinmuls.sidehub.domain.LatestChatMessage;
import org.springframework.stereotype.Component;

@Component
public class LatestChatMessageFactory {

    public LatestChatMessage fromDocument(LatestChatMessageDocument latestChatMessageDocument) {
        return LatestChatMessage.of(
                latestChatMessageDocument.getId(),
                latestChatMessageDocument.getChatRoomId(),
                latestChatMessageDocument.getMessage(),
                latestChatMessageDocument.getUnreadMessageCount(),
                latestChatMessageDocument.getCreatedAt()
        );
    }
}
