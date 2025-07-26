package com.goinmuls.sidehub.adapter.out.postgre.mapper;

import com.goinmuls.sidehub.adapter.in.rest.dto.response.FindNotificationResponseDto;
import com.goinmuls.sidehub.domain.Notification;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class NotificationMapper {

    /**
     * 도메인 -> 조회 응답 dto 변환
     * @param notification 도메인
     * @return 조회 응답 dto
     */
    public FindNotificationResponseDto toFindResponseDto(Notification notification) {
        if (ObjectUtils.isEmpty(notification)) {
            return  null;
        }

        return FindNotificationResponseDto.of(
                notification.getNotificationId(),
                notification.getSenderId(),
                notification.getContent(),
                notification.getNotificationStatus(),
                notification.getNotificationType(),
                notification.getCreatedAt()
        );
    }
}
