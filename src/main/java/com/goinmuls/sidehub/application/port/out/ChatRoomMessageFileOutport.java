package com.goinmuls.sidehub.application.port.out;

import com.goinmuls.sidehub.domain.ChatRoomMessageFile;

import java.util.List;

public interface ChatRoomMessageFileOutport {
    List<ChatRoomMessageFile> findAllByChatRoomId(Long chatRoomId);
}
