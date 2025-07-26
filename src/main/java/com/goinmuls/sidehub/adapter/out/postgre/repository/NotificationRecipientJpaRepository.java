package com.goinmuls.sidehub.adapter.out.postgre.repository;

import com.goinmuls.sidehub.adapter.out.postgre.entity.NotificationRecipientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationRecipientJpaRepository extends JpaRepository<NotificationRecipientEntity, Long> {
    Optional<NotificationRecipientEntity> findByNotificationId(Long notificationId);
}
