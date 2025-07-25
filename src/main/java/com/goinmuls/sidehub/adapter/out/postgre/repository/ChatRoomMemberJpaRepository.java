package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRoomMemberJpaRepository extends JpaRepository<ChatRoomMemberEntity, Long> {
    List<ChatRoomMemberEntity> findAllByChatRoomId(Long chatRoomId);
}
