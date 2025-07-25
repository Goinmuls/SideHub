package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoom;

public interface ChatRoomOutport {
    ChatRoom findById(Long id);
}
