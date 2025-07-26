package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomResponseDto;

public interface FindChatRoomUseCase {
    FindChatRoomResponseDto getChatRoom(Long id);
}
