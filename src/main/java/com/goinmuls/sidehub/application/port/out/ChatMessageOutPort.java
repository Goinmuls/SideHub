package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatMessage;

public interface ChatMessageOutPort {
    ChatMessage create(ChatMessage chatMessage);
}
