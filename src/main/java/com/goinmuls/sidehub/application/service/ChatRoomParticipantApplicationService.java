package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMemberResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.ChatRoomParticipantMapper;
import com.goinmuls.sidehub.application.port.in.FindChatRoomParticipantUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomParticipantOutPort;
import com.goinmuls.sidehub.domain.ChatRoomParticipant;
import com.goinmuls.sidehub.infrastructure.util.CollectionUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomParticipantApplicationService implements FindChatRoomParticipantUseCase {
    private final ChatRoomParticipantOutPort chatRoomParticipantOutport;
    private final ChatRoomParticipantMapper chatRoomParticipantMapper;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @Override
    public List<FindChatRoomMemberResponseDto> getParticipantsInChatRoom(Long chatRoomId) {
        List<ChatRoomParticipant> chatRoomParticipants = chatRoomParticipantOutport.findAllByChatRoomId(chatRoomId);

        if (CollectionUtils.isNullOrEmpty(chatRoomParticipants)) {
            throw new NoSuchElementException("채팅방 멤버를 찾을 수 없습니다.");
        }

        return chatRoomParticipants.stream()
                .map(chatRoomParticipantMapper::toFindResponseDto)
                .toList();
    }
}
