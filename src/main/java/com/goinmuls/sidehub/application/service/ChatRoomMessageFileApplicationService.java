package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.GetChatRoomMessageFileResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.mapper.ChatRoomMessageFileMapper;
import com.goinmuls.sidehub.application.port.in.GetChatRoomMessageFileUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomMessageFileOutPort;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomMessageFileApplicationService implements GetChatRoomMessageFileUseCase {
    private final ChatRoomMessageFileOutPort chatRoomMessageFileOutport;
    private final ChatRoomMessageFileMapper chatRoomMessageFileMapper;

    /**
     * 채팅방 첨부파일 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 첨부파일
     */
    @Override
    public List<GetChatRoomMessageFileResponseDto> getFilesInChatRoom(Long chatRoomId) {
        List<ChatRoomMessageFile> chatRoomMessageFiles = chatRoomMessageFileOutport.findAllByChatRoomId(chatRoomId);

        if (chatRoomMessageFiles == null) {
            throw new NoSuchElementException("채팅방 첨부파일을 찾을 수 없습니다.");
        }

        return chatRoomMessageFiles.stream()
                .map(chatRoomMessageFileMapper::toFindResponseDto)
                .toList();
    }
}
