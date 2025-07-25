package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.NotificationEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.NotificationJpaRepository;
import com.goinmuls.sidehub.application.port.out.NotificationOutPort;
import com.goinmuls.sidehub.domain.Notification;
import com.goinmuls.sidehub.domain.factory.NotificationFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationPersistenceAdapter implements NotificationOutPort {
    private final NotificationJpaRepository notificationJpaRepository;
    private final NotificationFactory notificationFactory;

    /**
     * 알림 조회
     * @param id 아이디
     * @return 알림
     */
    @Override
    public Notification findById(Long id) {
        NotificationEntity notificationEntity = notificationJpaRepository.findById(id).orElse(null);
        return notificationFactory.fromEntity(notificationEntity);
    }
}
