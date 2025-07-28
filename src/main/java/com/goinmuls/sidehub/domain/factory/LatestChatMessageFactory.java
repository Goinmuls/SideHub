package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.out.mongo.document.LatestChatMessageDocument;
import com.goinmuls.sidehub.domain.LatestChatMessage;
import org.springframework.stereotype.Component;

@Component
public class LatestChatMessageFactory {

    /**
     * 다큐먼트 -> 도메인 변환
     * @param latestChatMessageDocument 다큐먼트
     * @return 도메인
     */
    public LatestChatMessage fromDocument(LatestChatMessageDocument latestChatMessageDocument) {
        return LatestChatMessage.of(
                latestChatMessageDocument.getId(),
                latestChatMessageDocument.getChatRoomId(),
                latestChatMessageDocument.getMemberId(),
                latestChatMessageDocument.getMessage(),
                latestChatMessageDocument.getUnreadMessageCount(),
                latestChatMessageDocument.getCreatedAt()
        );
    }
}
