package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoomMember;

import java.util.List;

public interface ChatRoomMemberOutport {
    List<ChatRoomMember> findAllByChatRoomId(Long chatRoomId);
}
