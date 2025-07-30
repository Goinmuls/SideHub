package com.goinmuls.sidehub.adapter.in.rest;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomMemberResponseDto;
import com.goinmuls.sidehub.application.port.in.GetChatRoomParticipantUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/chat-room-member")
public class ChatRoomMemberController {
    private final GetChatRoomParticipantUseCase getChatRoomParticipantUseCase;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @GetMapping("/by-chat-room/{chatRoomId}")
    public List<GetChatRoomMemberResponseDto> getParticipantsInChatRoom(@PathVariable Long chatRoomId) {
        return getChatRoomParticipantUseCase.getParticipantsInChatRoom(chatRoomId);
    }
}
