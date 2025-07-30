package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomMessageFileResponseDto;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomMessageFileMapper {

    public GetChatRoomMessageFileResponseDto toFindResponseDto(ChatRoomMessageFile chatRoomMessageFile) {
        if (chatRoomMessageFile == null) {
            return null;
        }

        return GetChatRoomMessageFileResponseDto.of(
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
