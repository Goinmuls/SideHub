package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomMessageFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRoomMessageFileJpaRepository extends JpaRepository<ChatRoomMessageFileEntity, Long> {
    List<ChatRoomMessageFileEntity> findAllByChatRoomId(Long chatRoomId);
}
