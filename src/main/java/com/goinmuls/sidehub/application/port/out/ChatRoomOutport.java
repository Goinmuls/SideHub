package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoomMember;

import java.util.List;

public interface ChatRoomOutport {
    List<ChatRoomMember> findAllByChatRoomId(Long chatRoomId);
}
