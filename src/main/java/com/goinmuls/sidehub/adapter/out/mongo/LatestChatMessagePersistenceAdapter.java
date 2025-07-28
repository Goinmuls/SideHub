package com.goinmuls.sidehub.adapter.out.mongo;

import com.goinmuls.sidehub.adapter.out.mongo.document.LatestChatMessageDocument;
import com.goinmuls.sidehub.adapter.out.mongo.repository.LatestChatMessageMongoRepository;
import com.goinmuls.sidehub.application.port.out.LatestChatMessageOutPort;
import com.goinmuls.sidehub.domain.LatestChatMessage;
import com.goinmuls.sidehub.domain.factory.LatestChatMessageFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LatestChatMessagePersistenceAdapter implements LatestChatMessageOutPort {
    private final LatestChatMessageMongoRepository latestChatMessageMongoRepository;
    private final LatestChatMessageFactory latestChatMessageFactory;

    /**
     * 최신 메세지 조회
     * @param chatRoomId 채팅방 아이디
     * @return 최신 메세지
     */
    @Override
    public LatestChatMessage findByChatRoomId(String chatRoomId) {
        LatestChatMessageDocument latestChatMessageDocument = latestChatMessageMongoRepository.findByChatRoomId(chatRoomId);
        return latestChatMessageFactory.fromDocument(latestChatMessageDocument);
    }
}
