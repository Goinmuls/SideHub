package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomResponseDto;
import com.goinmuls.sidehub.application.port.in.FindChatRoomUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat-room")
@RequiredArgsConstructor
public class ChatRoomController {
    private final FindChatRoomUseCase findChatRoomUseCase;

    /**
     * 채팅방 조회
     * @param id 아이디
     * @return 채팅방
     */
    @GetMapping("/{id}")
    public FindChatRoomResponseDto findById(@PathVariable Long id) {
        return findChatRoomUseCase.findById(id);
    }
}
