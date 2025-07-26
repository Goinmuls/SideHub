package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomJpaRepository extends JpaRepository<ChatRoomEntity, Long> {
}
