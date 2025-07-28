package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.SendChatMessageRequestDto;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.SendChatMessageResponseDto;
import com.goinmuls.sidehub.adapter.out.mongo.mapper.ChatMessageMapper;
import com.goinmuls.sidehub.application.port.in.SendChatMessageUseCase;
import com.goinmuls.sidehub.application.port.out.ChatMessageOutPort;
import com.goinmuls.sidehub.domain.ChatMessage;
import com.goinmuls.sidehub.domain.factory.ChatMessageFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatMessageApplicationService implements SendChatMessageUseCase {
    private final ChatMessageOutPort chatMessageOutPort;
    private final ChatMessageFactory chatMessageFactory;
    private final ChatMessageMapper chatMessageMapper;

    /**
     * 채팅 메세지 저장
     * @param sendChatMessageRequestDto 저장할 채팅 메세지
     * @return 저장된 채팅 메세지
     */
    @Override
    public SendChatMessageResponseDto sendChatMessage(SendChatMessageRequestDto sendChatMessageRequestDto) {
        ChatMessage chatMessage = chatMessageFactory.fromSendRequestDto(sendChatMessageRequestDto);
        ChatMessage savedChatMessage = chatMessageOutPort.create(chatMessage);
        return chatMessageMapper.toSendResponseDto(savedChatMessage);
    }
}
