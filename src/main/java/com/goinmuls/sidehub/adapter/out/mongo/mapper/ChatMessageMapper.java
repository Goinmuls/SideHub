package com.goinmuls.sidehub.adapter.out.mongo.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.SendChatMessageResponseDto;
import com.goinmuls.sidehub.adapter.out.mongo.document.ChatMessageDocument;
import com.goinmuls.sidehub.domain.ChatMessage;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageMapper {

    /**
     * 도메인 -> 다큐먼트 변환
     * @param chatMessage 도메인
     * @return 다큐먼트
     */
    public ChatMessageDocument toDocument(ChatMessage chatMessage) {
        return ChatMessageDocument.of(
                chatMessage.getId(),
                chatMessage.getChatRoomId(),
                chatMessage.getSenderId(),
                chatMessage.getChatMessageType(),
                chatMessage.getContent(),
                chatMessage.getReadByUsers(),
                chatMessage.getChatFiles(),
                chatMessage.isDeleted(),
                chatMessage.getDeleteType(),
                chatMessage.getCreatedAt(),
                chatMessage.getDeletedAt()
        );
    }

    /**
     * 도메인 -> 저장 응답 dto 변환
     * @param chatMessage 도메인
     * @return 저장 응답 dto
     */
    public SendChatMessageResponseDto toSendResponseDto(ChatMessage chatMessage) {
        return SendChatMessageResponseDto.of(
                chatMessage.getId(),
                chatMessage.getChatRoomId(),
                chatMessage.getSenderId(),
                chatMessage.getChatMessageType(),
                chatMessage.getContent(),
                chatMessage.getReadByUsers(),
                chatMessage.getChatFiles(),
                chatMessage.isDeleted(),
                chatMessage.getDeleteType(),
                chatMessage.getCreatedAt(),
                chatMessage.getDeletedAt()
        );
    }
}
