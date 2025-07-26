package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.entity.NotificationEntity;
import com.goinmuls.sidehub.domain.Notification;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class NotificationFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param notificationEntity 엔티티
     * @return 도메인
     */
    public Notification fromEntity(NotificationEntity notificationEntity) {
        if (ObjectUtils.isEmpty(notificationEntity)) {
            return  null;
        }

        return Notification.of(
                notificationEntity.getNotificationId(),
                notificationEntity.getSenderId(),
                notificationEntity.getContent(),
                notificationEntity.getNotificationStatus(),
                notificationEntity.getNotificationType(),
                notificationEntity.getCreatedAt()
        );
    }
}
