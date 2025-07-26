package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMessageFileResponseDto;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ChatRoomMessageFileMapper {

    public FindChatRoomMessageFileResponseDto toFindResponseDto(ChatRoomMessageFile chatRoomMessageFile) {
        if (ObjectUtils.isEmpty(chatRoomMessageFile)) {
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
