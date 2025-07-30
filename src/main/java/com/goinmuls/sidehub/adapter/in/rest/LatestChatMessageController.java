package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetLatestChatMessageResponseDto;
import com.goinmuls.sidehub.application.port.in.GetLatestChatMessageUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/latest-chat-message")
public class LatestChatMessageController {
    private final GetLatestChatMessageUseCase getLatestChatMessageUseCase;

    /**
     * 최신 메세지 조회
     * @param chatRoomId 채팅방 아이디
     * @return 최신 메세지
     */
    @GetMapping("/by-chat-room/{chatRoomId}")
    public GetLatestChatMessageResponseDto getLatestChatMessage(@PathVariable Long chatRoomId) {
        return getLatestChatMessageUseCase.getLatestChatMessage(chatRoomId);
    }
}
