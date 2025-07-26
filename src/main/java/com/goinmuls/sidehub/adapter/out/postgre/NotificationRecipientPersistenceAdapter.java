package com.goinmuls.sidehub.adapter.out.postgre;

import com.goinmuls.sidehub.adapter.out.postgre.entity.NotificationRecipientEntity;
import com.goinmuls.sidehub.adapter.out.postgre.repository.NotificationRecipientJpaRepository;
import com.goinmuls.sidehub.application.port.out.NotificationRecipientOutPort;
import com.goinmuls.sidehub.domain.NotificationRecipient;
import com.goinmuls.sidehub.domain.factory.NotificationRecipientFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationRecipientPersistenceAdapter implements NotificationRecipientOutPort {
    private final NotificationRecipientJpaRepository notificationRecipientJpaRepository;
    private final NotificationRecipientFactory notificationRecipientFactory;

    /**
     * 알림 대상자 조회
     * @param notificationId 알림 아이디
     * @return 알림 대상
     */
    @Override
    public NotificationRecipient findByNotificationId(Long notificationId) {
        NotificationRecipientEntity notificationRecipientEntity = notificationRecipientJpaRepository.findByNotificationId(notificationId).orElse(null);
        return notificationRecipientFactory.fromEntity(notificationRecipientEntity);
    }
}
