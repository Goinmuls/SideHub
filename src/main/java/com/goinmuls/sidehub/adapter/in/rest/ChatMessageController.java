package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.SendChatMessageRequestDto;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.SendChatMessageResponseDto;
import com.goinmuls.sidehub.application.port.in.SendChatMessageUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/chat-message")
public class ChatMessageController {
    private final SendChatMessageUseCase sendChatMessageUseCase;

    /**
     * 채팅 메세지 저장
     * @param sendChatMessageRequestDto 저장할 채팅 메세지
     * @return 저장된 채팅 메세지
     */
    @PostMapping("/send")
    public SendChatMessageResponseDto sendChatMessage(@RequestBody SendChatMessageRequestDto sendChatMessageRequestDto) {
        return sendChatMessageUseCase.sendChatMessage(sendChatMessageRequestDto);
    }
}
