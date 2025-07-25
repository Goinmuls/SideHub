package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMemberResponseDto;

import java.util.List;

public interface FindChatRoomMemberUseCase {
    List<FindChatRoomMemberResponseDto> findAllByChatRoomId(Long chatRoomId);
}
