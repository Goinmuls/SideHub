package com.goinmuls.sidehub.application.service;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindChatRoomMessageFileResponseDto;
import com.goinmuls.sidehub.application.port.in.FindChatRoomMessageFileUseCase;
import com.goinmuls.sidehub.application.port.out.ChatRoomMessageFileOutPort;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import com.goinmuls.sidehub.domain.factory.ChatRoomMessageFileFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomMessageFileApplicationService implements FindChatRoomMessageFileUseCase {
    private final ChatRoomMessageFileOutPort chatRoomMessageFileOutport;
    private final ChatRoomMessageFileFactory chatRoomMessageFileFactory;

    /**
     * 채팅방 첨부파일 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 첨부파일
     */
    @Override
    public List<FindChatRoomMessageFileResponseDto> findAllByChatRoomId(Long chatRoomId) {
        List<ChatRoomMessageFile> chatRoomMessageFiles = chatRoomMessageFileOutport.findAllByChatRoomId(chatRoomId);

        if (ObjectUtils.isEmpty(chatRoomMessageFiles)) {
            throw new NoSuchElementException("채팅방 첨부파일을 찾을 수 없습니다.");
        }

        return chatRoomMessageFiles.stream()
                .map(chatRoomMessageFileFactory::toFindResponseDto)
                .toList();
    }
}
