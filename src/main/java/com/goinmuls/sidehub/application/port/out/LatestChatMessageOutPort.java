package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.LatestChatMessage;

public interface LatestChatMessageOutPort {
    LatestChatMessage findByChatRoomId(String chatRoomId);
}
