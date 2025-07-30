package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoomParticipant;

import java.util.List;

public interface ChatRoomParticipantOutPort {
    List<ChatRoomParticipant> findAllByChatRoomId(Long chatRoomId);
}
