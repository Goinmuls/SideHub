package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.request.SendChatMessageRequestDto;
import com.goinmuls.sidehub.adapter.in.rest.dto.response.SendChatMessageResponseDto;

public interface SendChatMessageUseCase {
    SendChatMessageResponseDto sendChatMessage(SendChatMessageRequestDto sendChatMessageRequestDto);
}
