package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatInbox;

public interface ChatInboxOutPort {
    void save(ChatInbox chatInbox);
}
