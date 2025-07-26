package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.ChatRoomMapper;
import com.goinmuls.sidehub.application.port.in.GetChatRoomUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomOutPort;
import com.goinmuls.sidehub.domain.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomApplicationService implements GetChatRoomUseCase {
    private final ChatRoomOutPort chatRoomOutport;
    private final ChatRoomMapper chatRoomMapper;

    /**
     * 채팅방 조회
     * @param id 아이디
     * @return 채팅방
     */
    @Override
    public GetChatRoomResponseDto getChatRoom(Long id) {
        ChatRoom chatRoom = chatRoomOutport.findById(id);

        if (chatRoom == null) {
            throw new NoSuchElementException("채팅방을 찾을 수 없습니다.");
        }

        return chatRoomMapper.toFindResponseDto(chatRoom);
    }
}
