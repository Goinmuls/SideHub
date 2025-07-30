package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.SendChatMessageRequestDto;
import com.goinmuls.sidehub.adapter.out.mongo.document.ChatMessageDocument;
import com.goinmuls.sidehub.domain.ChatMessage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ChatMessageFactory {

    /**
     * 저장 요청 dto -> 도메인 변환
     * @param sendChatMessageRequestDto 저장 요청 dto
     * @return 도메인
     */
    public ChatMessage fromSendRequestDto(SendChatMessageRequestDto sendChatMessageRequestDto) {
        if (sendChatMessageRequestDto == null) {
            return null;
        }

        return ChatMessage.of(
                null,
                sendChatMessageRequestDto.getChatRoomId(),
                sendChatMessageRequestDto.getSenderId(),
                sendChatMessageRequestDto.getChatMessageType(),
                sendChatMessageRequestDto.getContent(),
                new ArrayList<>(),
                sendChatMessageRequestDto.getChatFiles(),
                false,
                null,
                sendChatMessageRequestDto.getCreatedAt(),
                null
        );
    }

    /**
     * 다큐먼트 -> 도메인 변환
     * @param chatMessageDocument 다큐먼트
     * @return 도메인
     */
    public ChatMessage fromDocument(ChatMessageDocument chatMessageDocument) {
        if (chatMessageDocument == null) {
            return null;
        }

        return ChatMessage.of(
                chatMessageDocument.getId(),
                chatMessageDocument.getChatRoomId(),
                chatMessageDocument.getSenderId(),
                chatMessageDocument.getChatMessageType(),
                chatMessageDocument.getContent(),
                chatMessageDocument.getReadByUsers(),
                chatMessageDocument.getChatFiles(),
                chatMessageDocument.isDeleted(),
                chatMessageDocument.getDeleteType(),
                chatMessageDocument.getCreatedAt(),
                chatMessageDocument.getDeletedAt()
        );
    }
}
