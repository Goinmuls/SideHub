package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomMemberEntity;
import com.goinmuls.sidehub.domain.ChatRoomMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRoomMemberRepository extends JpaRepository<ChatRoomMemberEntity, Long> {
    List<ChatRoomMember> findAllByChatRoomId(Long chatRoomId);
}
