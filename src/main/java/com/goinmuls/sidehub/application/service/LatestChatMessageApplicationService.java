package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetLatestChatMessageResponseDto;
import com.goinmuls.sidehub.adapter.out.mongo.mapper.LatestChatMessageMapper;
import com.goinmuls.sidehub.application.port.in.GetLatestChatMessageUseCase;
import com.goinmuls.sidehub.application.port.out.LatestChatMessageOutPort;
import com.goinmuls.sidehub.domain.LatestChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LatestChatMessageApplicationService implements GetLatestChatMessageUseCase {
    private final LatestChatMessageOutPort latestChatMessageOutPort;
    private final LatestChatMessageMapper latestChatMessageMapper;

    /**
     * 최신 메세지 조회
     * @param chatRoomId 채팅방 아이디
     * @return 최신 메세지
     */
    @Override
    public GetLatestChatMessageResponseDto getLatestChatMessage(String chatRoomId) {
        LatestChatMessage latestChatMessage = latestChatMessageOutPort.findByChatRoomId(chatRoomId);
        return latestChatMessageMapper.toGetResponseDto(latestChatMessage);
    }
}
