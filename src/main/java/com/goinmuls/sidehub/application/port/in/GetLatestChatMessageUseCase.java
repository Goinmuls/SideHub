package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetLatestChatMessageResponseDto;

public interface GetLatestChatMessageUseCase {
    GetLatestChatMessageResponseDto getLatestChatMessage(String chatRoomId);
}
