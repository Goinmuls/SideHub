package com.goinmuls.sidehub.adapter.out.mongo;

import com.goinmuls.sidehub.adapter.out.mongo.document.ChatMessageDocument;
import com.goinmuls.sidehub.adapter.out.mongo.mapper.ChatMessageMapper;
import com.goinmuls.sidehub.adapter.out.mongo.repository.ChatMessageMongoRepository;
import com.goinmuls.sidehub.application.port.out.ChatMessageOutPort;
import com.goinmuls.sidehub.domain.ChatMessage;
import com.goinmuls.sidehub.domain.factory.ChatMessageFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatMessagePersistenceAdapter implements ChatMessageOutPort {
    private final ChatMessageMongoRepository chatMessageMongoRepository;
    private final ChatMessageMapper chatMessageMapper;
    private final ChatMessageFactory chatMessageFactory;

    /**
     * 채팅 메세지 저장
     * @param chatMessage 저장할 채팅 메세지
     * @return 저장된 채팅 메세지
     */
    public ChatMessage create(ChatMessage chatMessage) {
        ChatMessageDocument chatMessageDocument = chatMessageMapper.toDocument(chatMessage);
        ChatMessageDocument savedChatMessageDocument = chatMessageMongoRepository.save(chatMessageDocument);
        return chatMessageFactory.fromDocument(savedChatMessageDocument);
    }
}
