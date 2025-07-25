package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomMessageFileEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.ChatRoomMessageFileJpaRepository;
import com.goinmuls.sidehub.application.port.out.ChatRoomMessageFileOutport;
import com.goinmuls.sidehub.domain.ChatRoomMessageFile;
import com.goinmuls.sidehub.domain.factory.ChatRoomMessageFileFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChatRoomMessageFilePersistenceAdapter implements ChatRoomMessageFileOutport {
    private final ChatRoomMessageFileJpaRepository chatRoomMessageFileJpaRepository;
    private final ChatRoomMessageFileFactory chatRoomMessageFileFactory;

    /**
     * 채팅방 메세지 첨부파일 조회
     * @param chatRoomId 채팅방 아이디
     * @return 채팅방 메세지 첨부파일
     */
    @Override
    public List<ChatRoomMessageFile> findAllByChatRoomId(Long chatRoomId) {
        List<ChatRoomMessageFileEntity> chatRoomMessageFileEntities = chatRoomMessageFileJpaRepository.findAllByChatRoomId(chatRoomId);
        return chatRoomMessageFileEntities.stream()
                .map(chatRoomMessageFileFactory::fromEntity)
                .toList();
    }
}
