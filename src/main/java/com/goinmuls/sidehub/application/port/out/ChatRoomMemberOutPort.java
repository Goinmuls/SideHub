package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoomMember;

import java.util.List;

public interface ChatRoomMemberOutPort {
    List<ChatRoomMember> findAllByChatRoomId(Long chatRoomId);
}
