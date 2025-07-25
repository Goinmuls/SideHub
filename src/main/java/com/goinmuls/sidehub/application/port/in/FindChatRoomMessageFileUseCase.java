package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMessageFileResponseDto;

import java.util.List;

public interface FindChatRoomMessageFileUseCase {

    List<FindChatRoomMessageFileResponseDto> findAllByChatRoomId(Long chatRoomId);
}
