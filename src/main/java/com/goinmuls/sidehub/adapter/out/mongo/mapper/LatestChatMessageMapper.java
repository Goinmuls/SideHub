package com.goinmuls.sidehub.adapter.out.mongo.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetLatestChatMessageResponseDto;
import com.goinmuls.sidehub.domain.LatestChatMessage;
import org.springframework.stereotype.Component;

@Component
public class LatestChatMessageMapper {

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param latestChatMessage 도메인
     * @return 조회 응답 dto
     */
    public GetLatestChatMessageResponseDto toGetResponseDto(LatestChatMessage latestChatMessage) {
        return GetLatestChatMessageResponseDto.of(
                latestChatMessage.getId(),
                latestChatMessage.getChatRoomId(),
                latestChatMessage.getMemberId(),
                latestChatMessage.getMessage(),
                latestChatMessage.getUnreadMessageCount(),
                latestChatMessage.getCreatedAt()
        );
    }
}
