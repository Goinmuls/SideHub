package com.goinmuls.sidehub.application.port.in;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomMemberResponseDto;

import java.util.List;

public interface GetChatRoomParticipantUseCase {
    List<GetChatRoomMemberResponseDto> getParticipantsInChatRoom(Long chatRoomId);
}
