package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationRecipientResponseDto;
import com.goinmuls.sidehub.domain.NotificationRecipient;
import org.springframework.stereotype.Component;

@Component
public class NotificationRecipientMapper {

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param notificationRecipient 도메인
     * @return 조회 응답 dto
     */
    public FindNotificationRecipientResponseDto toFindResponseDto(NotificationRecipient notificationRecipient) {
        if (notificationRecipient == null) {
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
