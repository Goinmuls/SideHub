package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRoomParticipantJpaRepository extends JpaRepository<ChatRoomParticipantEntity, Long> {
    List<ChatRoomParticipantEntity> findAllByChatRoomId(Long chatRoomId);
}
