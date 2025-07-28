package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomMemberResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.ChatRoomParticipantMapper;
import com.goinmuls.sidehub.application.port.in.GetChatRoomParticipantUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomParticipantOutPort;
import com.goinmuls.sidehub.domain.ChatRoomParticipant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomParticipantApplicationService implements GetChatRoomParticipantUseCase {
    private final ChatRoomParticipantOutPort chatRoomParticipantOutport;
    private final ChatRoomParticipantMapper chatRoomParticipantMapper;

    /**
     * 채팅방 멤버 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 멤버 리스트
     */
    @Override
    public List<GetChatRoomMemberResponseDto> getParticipantsInChatRoom(Long chatRoomId) {
        List<ChatRoomParticipant> chatRoomParticipants = chatRoomParticipantOutport.findAllByChatRoomId(chatRoomId);

        if (CollectionUtils.isEmpty(chatRoomParticipants)) {
            throw new NoSuchElementException("채팅방 멤버를 찾을 수 없습니다.");
        }

        return chatRoomParticipants.stream()
                .map(chatRoomParticipantMapper::toFindResponseDto)
                .toList();
    }
}
