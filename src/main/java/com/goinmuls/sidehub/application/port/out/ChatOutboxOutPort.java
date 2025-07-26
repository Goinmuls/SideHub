package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatOutbox;

public interface ChatOutboxOutPort {
    void save(ChatOutbox chatOutbox);
}
