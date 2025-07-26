package com.goinmuls.sidehub.domain.factory;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationRecipientResponseDto;
import com.goinmuls.sidehub.adapter.out.postgre.entity.NotificationRecipientEntity;
import com.goinmuls.sidehub.domain.NotificationRecipient;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class NotificationRecipientFactory {

    /**
     * 엔티티 -> 도메인 변환
     * @param notificationRecipientEntity 엔티티
     * @return 도메인
     */
    public NotificationRecipient fromEntity(NotificationRecipientEntity notificationRecipientEntity) {
        if (ObjectUtils.isEmpty(notificationRecipientEntity)) {
            return null;
        }

        return NotificationRecipient.of(
                notificationRecipientEntity.getNotificationRecipientId(),
                notificationRecipientEntity.getNotificationId(),
                notificationRecipientEntity.getNotificationTargetId(),
                notificationRecipientEntity.isRead(),
                notificationRecipientEntity.getReadAt()
        );
    }

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param notificationRecipient 도메인
     * @return 조회 응답 dto
     */
    public FindNotificationRecipientResponseDto toFindResponseDto(NotificationRecipient notificationRecipient) {
        if (ObjectUtils.isEmpty(notificationRecipient)) {
            return null;
        }

        return FindNotificationRecipientResponseDto.of(
                notificationRecipient.getNotificationRecipientId(),
                notificationRecipient.getNotificationId(),
                notificationRecipient.getNotificationTargetId(),
                notificationRecipient.isRead(),
                notificationRecipient.getReadAt()
        );
    }
}
