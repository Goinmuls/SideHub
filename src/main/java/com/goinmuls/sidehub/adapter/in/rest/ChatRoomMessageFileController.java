package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMessageFileResponseDto;
import com.goinmuls.sidehub.application.port.in.FindChatRoomMessageFileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/chat-message-file")
public class ChatRoomMessageFileController {
    private final FindChatRoomMessageFileUseCase findChatRoomMessageFileUseCase;

    /***
     * 채팅방 첨부파일 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 첨부파일 리스트
     */
    @GetMapping("/{chatRoomId}")
    public List<FindChatRoomMessageFileResponseDto> findAllByChatRoomId(@PathVariable Long chatRoomId) {
        return findChatRoomMessageFileUseCase.findAllByChatRoomId(chatRoomId);
    }
}
