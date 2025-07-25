package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoom;

public interface ChatRoomOutPort {
    ChatRoom findById(Long id);
}
