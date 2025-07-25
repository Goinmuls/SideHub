package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomResponseDto;
import com.goinmuls.sidehub.application.port.in.FindChatRoomUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomOutport;
import com.goinmuls.sidehub.domain.ChatRoom;
import com.goinmuls.sidehub.domain.factory.ChatRoomFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomApplicationService implements FindChatRoomUseCase {
    private final ChatRoomOutport chatRoomOutport;
    private final ChatRoomFactory chatRoomFactory;

    /**
     * 채팅방 조회
     * @param id 아이디
     * @return 채팅방
     */
    @Override
    public FindChatRoomResponseDto findById(Long id) {
        ChatRoom chatRoom = chatRoomOutport.findById(id);

        if (ObjectUtils.isEmpty(chatRoom)) {
            throw new NoSuchElementException("채팅방을 찾을 수 없습니다.");
        }

        return chatRoomFactory.toFindDto(chatRoom);
    }
}
