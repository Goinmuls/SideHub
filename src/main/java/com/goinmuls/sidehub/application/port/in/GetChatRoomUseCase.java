package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomResponseDto;

public interface GetChatRoomUseCase {
    GetChatRoomResponseDto getChatRoom(Long id);
}
