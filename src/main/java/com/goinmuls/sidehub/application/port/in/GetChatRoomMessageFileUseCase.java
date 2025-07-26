package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomMessageFileResponseDto;

import java.util.List;

public interface GetChatRoomMessageFileUseCase {
    List<GetChatRoomMessageFileResponseDto> getFilesInChatRoom(Long chatRoomId);
}
