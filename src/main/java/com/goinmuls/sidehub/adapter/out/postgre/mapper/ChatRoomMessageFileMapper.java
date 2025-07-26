package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMessageFileResponseDto;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomMessageFileMapper {

    public FindChatRoomMessageFileResponseDto toFindResponseDto(ChatRoomMessageFile chatRoomMessageFile) {
        if (chatRoomMessageFile == null) {
            return null;
        }

        return FindChatRoomMessageFileResponseDto.of(
                chatRoomMessageFile.getChatRoomMessageFileId(),
                chatRoomMessageFile.getChatRoomId(),
                chatRoomMessageFile.getFileMetaId(),
                chatRoomMessageFile.getMemberId(),
                chatRoomMessageFile.isDeleted(),
                chatRoomMessageFile.getCreatedAt(),
                chatRoomMessageFile.getDeletedAt()
        );
    }
}
